package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;

public interface ParcelService {
    void reportParcelDelivery(String trackingId) throws BLException;
    void reportParcelHop(String trackingId, String code) throws BLException;
    NewParcelInfo submitParcel(Parcel parcel) throws BLException;
    Parcel trackParcel(String trackingId);
    Parcel transitionParcel(String trackingId, Parcel parcel);
}
