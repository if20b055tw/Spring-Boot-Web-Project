package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.HopEntity, HopEntity> {
    public static HopDalMapper INSTANCE = Mappers.getMapper(HopDalMapper.class);
}
