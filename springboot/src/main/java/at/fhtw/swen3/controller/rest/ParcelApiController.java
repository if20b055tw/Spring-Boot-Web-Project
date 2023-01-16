package at.fhtw.swen3.controller.rest;


import at.fhtw.swen3.gps.service.Address;
import at.fhtw.swen3.gps.service.GeoEncodingService;
import at.fhtw.swen3.gps.service.impl.OpenStreetMapsEncodingProxy;
import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.dto.Error;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.exceptions.BLDataNotFoundException;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.services.impl.ParcelService;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.NewParcelInfoMapper;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.mapper.TrackingInformationMapper;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-20T11:34:14.505164Z[Etc/UTC]")
@Controller
@Slf4j
public class ParcelApiController implements ParcelApi {

    private final NativeWebRequest request;
    private final ParcelService parcelService;
    private final ParcelMapper parcelMapper;
    private final NewParcelInfoMapper newParcelInfoMapper;
    private final TrackingInformationMapper trackingInformationMapper;

    @Autowired
    public ParcelApiController(NativeWebRequest request, ParcelService parcelService, ParcelMapper parcelMapper, NewParcelInfoMapper newParcelInfoMapper, TrackingInformationMapper trackingInformationMapper) {
        this.request = request;
        this.parcelService = parcelService;
        this.parcelMapper = parcelMapper;
        this.newParcelInfoMapper = newParcelInfoMapper;
        this.trackingInformationMapper = trackingInformationMapper;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        log.info("Calling: getRequest");
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity reportParcelDelivery(String trackingId) {
        log.info("Calling: reportParcelDelivery");
        try {
            parcelService.reportParcelDelivery(trackingId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (BLDataNotFoundException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }





        /*ActionResult actionResult = parcelService.reportParcelDelivery(trackingId);
        switch (actionResult.getResult()) {
            case ERROR:
                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
            case MISSING:
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            case NO_ERROR:
                return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);*/
    }

    @Override
    public ResponseEntity reportParcelHop(String trackingId, String code) {
        log.info("Calling: reportParcelHop");
        try {
            parcelService.reportParcelHop(trackingId, code);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (BLDataNotFoundException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }

        /*parcelService.reportParcelHop(trackingId, code);

        return ParcelApi.super.reportParcelHop(trackingId, code);*/
    }

    @Override
    public ResponseEntity submitParcel(Parcel parcel) {
        log.info("Calling: submitParcel");
        try {
            NewParcelInfo newParcelInfo = parcelService.submitParcel(parcel);
            return new ResponseEntity<NewParcelInfo>(newParcelInfo, HttpStatus.CREATED);
        } catch (BLDataNotFoundException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The address of sender or receiver was not found."), HttpStatus.NOT_FOUND);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<TrackingInformation> trackParcel(String trackingId) {
        log.info("Calling: trackParcel");
        Parcel trackingInformation = parcelService.trackParcel(trackingId);
        return ParcelApi.super.trackParcel(trackingId);
    }

    @Override
    public ResponseEntity<NewParcelInfo> transitionParcel(String trackingId, Parcel parcel) {
        log.info("Calling: transitionParcel");
//        ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);
//        ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);
        Parcel newParcelInfo = parcelService.transitionParcel(trackingId, parcel);
//        NewParcelInfo newParcelInfo = newParcelInfoMapper.mapToSource(newParcelInfoEntity);

        return ParcelApi.super.transitionParcel(trackingId, parcel);
    }

}
