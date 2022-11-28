package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.utils.ActionResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ParcelServiceImpl implements ParcelService {

    private final MyValidator myValidator;


    @Override
    public ActionResult reportParcelDelivery(String trackingId) {
        log.info("Report parcel delivery for parcel with tracking ID: '" + trackingId + "'");
        return new ActionResult(ActionResult.Result.NO_ERROR);
    }

    @Override
    public void reportParcelHop(String trackingId, String code) {
        log.info("Report parcel hop for parcel with tracking ID: '" + trackingId + "' to hop with code '" + code + "'");
    }

    @Override
    public Parcel submitParcel(Parcel parcel) {
        log.info("Submit Parcel");
        return null;
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