package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class WarehouseNextHopsDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.WarehouseNextHopsEntity, WarehouseNextHopsEntity> {
    public static WarehouseNextHopsDalMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsDalMapper.class);
}
