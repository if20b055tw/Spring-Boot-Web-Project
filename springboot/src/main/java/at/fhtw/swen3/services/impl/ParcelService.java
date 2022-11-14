package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.controller.rest.ApiUtil;
import at.fhtw.swen3.controller.rest.ParcelApi;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.utils.ActionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public interface ParcelService {
    ActionResult reportParcelDelivery(String trackingId);
    void reportParcelHop(String trackingId, String code);
    ParcelEntity submitParcel(ParcelEntity parcelEntity);
    ParcelEntity trackParcel(String trackingId);
    ParcelEntity transitionParcel(String trackingId, ParcelEntity parcelEntity);
}
