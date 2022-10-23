package at.fhtw.swen3.services.impl;


import at.fhtw.swen3.model.repositories.ParcelRepository;
import at.fhtw.swen3.services.ParcelApi;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-20T11:34:14.505164Z[Etc/UTC]")
@Controller
public class ParcelApiController implements ParcelApi {

    private final NativeWebRequest request;

    //private final ParcelMapper parcelMapper;
    //private final ParcelRepository parcelRepository;

    @Autowired
    public ParcelApiController(NativeWebRequest request/*, ParcelRepository parcelRepository*/) {
        this.request = request;
        //this.parcelMapper = ParcelMapper.INSTANCE;
        //this.parcelRepository = parcelRepository;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> reportParcelDelivery(String trackingId) {
        //parcelRepository.reportParcelDelivery(trackingId);

        return ParcelApi.super.reportParcelDelivery(trackingId);
    }

    @Override
    public ResponseEntity<Void> reportParcelHop(String trackingId, String code) {
        return ParcelApi.super.reportParcelHop(trackingId, code);
    }

    @Override
    public ResponseEntity<NewParcelInfo> submitParcel(Parcel parcel) {
        return ParcelApi.super.submitParcel(parcel);
    }

    @Override
    public ResponseEntity<TrackingInformation> trackParcel(String trackingId) {
        return ParcelApi.super.trackParcel(trackingId);
    }

    @Override
    public ResponseEntity<NewParcelInfo> transitionParcel(String trackingId, Parcel parcel) {
        return ParcelApi.super.transitionParcel(trackingId, parcel);
    }

}
