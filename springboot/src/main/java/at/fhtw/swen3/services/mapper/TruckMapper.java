package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TruckEntity;
import at.fhtw.swen3.services.dto.Truck;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses=GeoCoordinateMapperImpl.class)
public abstract class TruckMapper extends AbstractMapper<Truck, TruckEntity> {
    public static TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);
}
