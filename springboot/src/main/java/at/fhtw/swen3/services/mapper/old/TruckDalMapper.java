package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.TruckEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class TruckDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.TruckEntity, TruckEntity> {
    public static TruckDalMapper INSTANCE = Mappers.getMapper(TruckDalMapper.class);
}
