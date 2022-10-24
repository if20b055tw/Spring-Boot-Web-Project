package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.WarehouseNextHopsDal;
import at.fhtw.swen3.persistence.entity.WarehouseNextHopsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class WarehouseNextHopsDalMapper extends AbstractMapper<WarehouseNextHopsEntity, WarehouseNextHopsDal> {
    public static WarehouseNextHopsDalMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsDalMapper.class);
}
