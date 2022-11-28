package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.utils.ActionResult;

public interface ParcelService {
    ActionResult reportParcelDelivery(String trackingId);
    void reportParcelHop(String trackingId, String code);
    ParcelEntity submitParcel(ParcelEntity parcelEntity);
    ParcelEntity trackParcel(String trackingId);
    ParcelEntity transitionParcel(String trackingId, ParcelEntity parcelEntity);
}
