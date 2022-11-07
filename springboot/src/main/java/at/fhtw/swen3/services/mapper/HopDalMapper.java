package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.HopEntity, HopEntity> {
    public static HopDalMapper INSTANCE = Mappers.getMapper(HopDalMapper.class);
}
