package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.utils.ActionResult;

public interface ParcelService {
    ActionResult reportParcelDelivery(String trackingId);
    void reportParcelHop(String trackingId, String code);
    Parcel submitParcel(Parcel parcel);
    Parcel trackParcel(String trackingId);
    Parcel transitionParcel(String trackingId, Parcel parcel);
}
