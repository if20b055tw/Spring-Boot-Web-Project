package at.fhtw.swen3.services;

import at.fhtw.swen3.controller.rest.ApiUtil;
import at.fhtw.swen3.controller.rest.ParcelApi;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public interface ParcelService {
    void reportParcelDelivery(String trackingId);
    void reportParcelHop(String trackingId, String code);
    ParcelEntity submitParcel(ParcelEntity parcelEntity);
    ParcelEntity trackParcel(String trackingId);
    ParcelEntity transitionParcel(String trackingId, ParcelEntity parcelEntity);
}
