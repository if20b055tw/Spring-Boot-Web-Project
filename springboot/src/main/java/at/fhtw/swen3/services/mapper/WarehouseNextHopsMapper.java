package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.WarehouseNextHops;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses=GeoCoordinateMapperImpl.class)
public abstract class WarehouseNextHopsMapper extends AbstractMapper<WarehouseNextHops, WarehouseNextHopsEntity> {
    public static WarehouseNextHopsMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsMapper.class);
}
