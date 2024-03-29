package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {GeoCoordinateMapperImpl.class, WarehouseNextHopsMapperImpl.class})
public abstract class WarehouseMapper extends AbstractMapper<Warehouse, WarehouseEntity> {
    public static WarehouseMapper INSTANCE = Mappers.getMapper(WarehouseMapper.class);
}
