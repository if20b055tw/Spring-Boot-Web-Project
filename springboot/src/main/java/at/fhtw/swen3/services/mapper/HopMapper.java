package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.services.dto.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopMapper extends AbstractMapper<Hop, HopEntity> {
    public static HopMapper INSTANCE = Mappers.getMapper(HopMapper.class);
}
