package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.gps.service.Address;
import at.fhtw.swen3.gps.service.GeoEncodingService;
import at.fhtw.swen3.persistence.entities.*;
import at.fhtw.swen3.persistence.repositories.HopRepository;
import at.fhtw.swen3.persistence.repositories.ParcelRepository;
import at.fhtw.swen3.services.dto.*;
import at.fhtw.swen3.services.exceptions.BLDataNotFoundException;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.services.mapper.NewParcelInfoMapper;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.HttpResponse;
import at.fhtw.swen3.utils.HttpUtils;
import at.fhtw.swen3.utils.Pair;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class ParcelServiceImpl implements ParcelService {

    private final MyValidator myValidator;

    private final ParcelMapper parcelMapper;
    private final ParcelRepository parcelRepository;

    private final NewParcelInfoMapper newParcelInfoMapper;

    private final HopRepository hopRepository;

    private final GeoEncodingService geoEncodingService;


    @Override
    public void reportParcelDelivery(String trackingId) throws BLException {
        log.info("Report parcel delivery for parcel with tracking ID: '" + trackingId + "'");
        try {
            Optional<ParcelEntity> parcelEntity = parcelRepository.findByTrackingId(trackingId);
            if (parcelEntity.isPresent()) {
                parcelEntity.get().setState(TrackingInformation.StateEnum.DELIVERED);
                parcelRepository.save(parcelEntity.get());
//                return new ActionResult(ActionResult.Result.NO_ERROR);
            } else {
                throw new BLDataNotFoundException("parcel not found");
//                return new ActionResult(ActionResult.Result.MISSING);
            }
        } catch (BLDataNotFoundException e) {
            throw e;
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new BLException("unknown error", e);
            //return new ActionResult(ActionResult.Result.ERROR);
        }
    }

    private String getLogisticsPartnerUrl(TransferwarehouseEntity transferwarehouseEntity, String trackingId) {
        return transferwarehouseEntity.getLogisticsPartnerUrl() + "/parcel/" + trackingId;
    }

    @Override
    public void reportParcelHop(String trackingId, String code) throws BLException {
        log.info("Report parcel hop for parcel with tracking ID: '" + trackingId + "' to hop with code '" + code + "'");

        try {
            Optional<ParcelEntity> parcelEntity = parcelRepository.findByTrackingId(trackingId);
            Optional<HopEntity> hopEntity = hopRepository.findByCode(code);
            if (parcelEntity.isPresent() && hopEntity.isPresent()) {
                for (int i = 0; i < parcelEntity.get().getFutureHops().size(); ++i) {
                    if (code.equals(parcelEntity.get().getFutureHops().get(i).getCode())) {
                        parcelEntity.get().getFutureHops().remove(i);
                        break;
                    }
                }
                parcelEntity.get().getVisitedHops().add(HopArrivalEntity.builder().parcel(parcelEntity.get()).code(code).description("").dateTime(OffsetDateTime.now()).build());
                if (hopEntity.get() instanceof TruckEntity) {
                    parcelEntity.get().setState(TrackingInformation.StateEnum.INTRUCKDELIVERY);
                } else if (hopEntity.get() instanceof  TransferwarehouseEntity) {
                    parcelEntity.get().setState(TrackingInformation.StateEnum.TRANSFERRED);
                } else if (hopEntity.get() instanceof WarehouseEntity) {
                    parcelEntity.get().setState(TrackingInformation.StateEnum.INTRANSPORT);
                }
                parcelRepository.save(parcelEntity.get());
            } else {
                throw new BLDataNotFoundException("parcel or hop not found");
            }
        } catch (BLDataNotFoundException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new BLException("unknown error", e);
        }
    }

    private String createUniqueTrackingId() {
        return "123456789";
    }

    private Address getAddressFromRecipient(Recipient recipient) {
        return new Address(
                recipient.getStreet(),
                recipient.getPostalCode(),
                recipient.getCity(),
                recipient.getCountry()
        );
    }

    @Override
    public NewParcelInfo submitParcel(Parcel parcel) throws BLException {
        log.info("Submit Parcel");
        try {
            String tid = createUniqueTrackingId();
            GeoCoordinate senderCoords = geoEncodingService.encodeAddress(getAddressFromRecipient(parcel.getSender()));
            GeoCoordinate recipientCoords = geoEncodingService.encodeAddress(getAddressFromRecipient(parcel.getRecipient()));

            ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);

            parcelEntity.setFutureHops(new ArrayList<>());
            parcelEntity.setVisitedHops(new ArrayList<>());

            parcelEntity.setTrackingId(tid);
            parcelEntity.setState(TrackingInformation.StateEnum.PICKUP);
            ParcelEntity newParcelEntity = parcelRepository.save(parcelEntity);

            return newParcelInfoMapper.mapToSource(newParcelEntity);
        } catch (Exception e) {
            throw new BLException(e.getMessage(), e);
        }
    }

    @Override
    public Parcel trackParcel(String trackingId) {
        log.info("Track parcel with tracking ID: '" + trackingId + "'");
        return null;
    }

    @Override
    public Parcel transitionParcel(String trackingId, Parcel parcel) {
        log.info("Transition parcel with tracking ID: '" + trackingId + "'");
        return null;
    }
}