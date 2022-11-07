package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class WarehouseDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.WarehouseEntity, WarehouseEntity> {
    public static WarehouseDalMapper INSTANCE = Mappers.getMapper(WarehouseDalMapper.class);
}
