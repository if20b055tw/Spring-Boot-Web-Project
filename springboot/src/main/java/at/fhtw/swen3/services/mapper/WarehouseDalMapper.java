package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.WarehouseDal;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class WarehouseDalMapper extends AbstractMapper<WarehouseEntity, WarehouseDal> {
    public static WarehouseDalMapper INSTANCE = Mappers.getMapper(WarehouseDalMapper.class);
}
