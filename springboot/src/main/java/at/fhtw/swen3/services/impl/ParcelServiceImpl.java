package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.services.ParcelService;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.mapper.old.OldParcelMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.*;
import java.util.Arrays;
import java.util.Set;

@RequiredArgsConstructor
@Slf4j
public class ParcelServiceImpl implements ParcelService {

    private final MyValidator myValidator;


    @Override
    public void reportParcelDelivery(String trackingId) {

    }

    @Override
    public void reportParcelHop(String trackingId, String code) {

    }

    @Override
    public ParcelEntity submitParcel(ParcelEntity parcelEntity) {
        return null;
    }

    @Override
    public ParcelEntity trackParcel(String trackingId) {
        return null;
    }

    @Override
    public ParcelEntity transitionParcel(String trackingId, ParcelEntity parcelEntity) {
        return null;
    }
}