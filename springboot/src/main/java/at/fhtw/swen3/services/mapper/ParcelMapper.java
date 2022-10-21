package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.mapstruct.Mapper;

@Mapper
public interface ParcelMapper {
    Parcel mapToParcel(ParcelEntity parcelEntity);
    NewParcelInfo mapToNewParcelInfo(ParcelEntity parcelEntity);
    TrackingInformation mapToTrackingInformation(ParcelEntity parcelEntity);
    ParcelEntity mapToParcelEntity(Parcel parcel, NewParcelInfo newParcelInfo, TrackingInformation trackingInformation);
}
