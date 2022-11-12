package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopArrivalDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.HopArrivalEntity, HopArrivalEntity> {
    public static HopArrivalDalMapper INSTANCE = Mappers.getMapper(HopArrivalDalMapper.class);
}
