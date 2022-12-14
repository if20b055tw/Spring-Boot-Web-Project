package at.fhtw.swen3.controller.rest;


import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.impl.ParcelService;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.NewParcelInfoMapper;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.mapper.TrackingInformationMapper;
import at.fhtw.swen3.utils.ActionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> reportParcelDelivery(String trackingId) {
        log.info("Calling: reportParcelDeilivery");
        ActionResult actionResult = parcelService.reportParcelDelivery(trackingId);
//        switch (actionResult) {
//            case ERROR:
//                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
//            case MISSING:
//                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
//            case NO_ERROR:
//                return new ResponseEntity<Void>(HttpStatus.OK);
//        }

        return ParcelApi.super.reportParcelDelivery(trackingId);
    }

    @Override
    public ResponseEntity<Void> reportParcelHop(String trackingId, String code) {
        log.info("Calling: reportParcelHop");
        parcelService.reportParcelHop(trackingId, code);

        return ParcelApi.super.reportParcelHop(trackingId, code);
    }

    @Override
    public ResponseEntity<NewParcelInfo> submitParcel(Parcel parcel) {
        log.info("Calling: submitParcel");
        ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);
        ParcelEntity newParcelInfoEntity = parcelService.submitParcel(parcelEntity);
        NewParcelInfo newParcelInfo = newParcelInfoMapper.mapToSource(newParcelInfoEntity);

        //System.out.println(parcelEntity.getWeight());

        return ParcelApi.super.submitParcel(parcel);
    }

    @Override
    public ResponseEntity<TrackingInformation> trackParcel(String trackingId) {
        log.info("Calling: trackParcel");
        /*Optional<TrackingInformation.StateEnum> state = parcelRepository.trackParcel(trackingId);
        if (state.isPresent()) {

        } else {
            return
        }*/

        /*getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //String exampleString = "{ \"visitedHops\" : [ { \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"code\" : \"code\", \"description\" : \"description\" }, { \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"code\" : \"code\", \"description\" : \"description\" } ], \"futureHops\" : [ { \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"code\" : \"code\", \"description\" : \"description\" }, { \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"code\" : \"code\", \"description\" : \"description\" } ], \"state\" : \"Pickup\" }";
                    String exampleString = "{\"HAHAHAAHAHAH\": \"XD\"}";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });*/

        //MultiValueMap lmvm = new LinkedMultiValueMap<>();
        //lmvm.add("Content-Type", "application/json");

        //return new ResponseEntity<>("{\"HAHAHAAHAHAH\": \"XD\"}", lmvm, HttpStatus.ACCEPTED);
        //return new ResponseEntity<>(HttpStatus.ACCEPTED);

        ParcelEntity trackingInformationEntity = parcelService.trackParcel(trackingId);
        TrackingInformation trackingInformation = trackingInformationMapper.mapToSource(trackingInformationEntity);

        return ParcelApi.super.trackParcel(trackingId);
    }

    @Override
    public ResponseEntity<NewParcelInfo> transitionParcel(String trackingId, Parcel parcel) {
        log.info("Calling: transitionParcel");
        //ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);
        ParcelEntity parcelEntity = parcelMapper.mapToTarget(parcel);
        ParcelEntity newParcelInfoEntity = parcelService.transitionParcel(trackingId, parcelEntity);
        NewParcelInfo newParcelInfo = newParcelInfoMapper.mapToSource(newParcelInfoEntity);

        return ParcelApi.super.transitionParcel(trackingId, parcel);
    }

}
