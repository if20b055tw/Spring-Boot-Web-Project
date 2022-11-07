package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TruckEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class TruckDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.TruckEntity, TruckEntity> {
    public static TruckDalMapper INSTANCE = Mappers.getMapper(TruckDalMapper.class);
}
