package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.dto.Parcel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ParcelMapper extends AbstractMapper<Parcel, ParcelEntity> {
    public static ParcelMapper INSTANCE = Mappers.getMapper(ParcelMapper.class);

    //public static ParcelMapper INSTANCE = Mappers.getMapper(ParcelMapper.class);

    /*Parcel mapToParcel(ParcelEntity parcelEntity);
    NewParcelInfo mapToNewParcelInfo(ParcelEntity parcelEntity);
    TrackingInformation mapToTrackingInformation(ParcelEntity parcelEntity);
    ParcelEntity mapToParcelEntity(Parcel parcel, NewParcelInfo newParcelInfo, TrackingInformation trackingInformation);*/
}
