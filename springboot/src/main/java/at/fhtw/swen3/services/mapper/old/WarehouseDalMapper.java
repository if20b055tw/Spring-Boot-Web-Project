package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class WarehouseDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.WarehouseEntity, WarehouseEntity> {
    public static WarehouseDalMapper INSTANCE = Mappers.getMapper(WarehouseDalMapper.class);
}
