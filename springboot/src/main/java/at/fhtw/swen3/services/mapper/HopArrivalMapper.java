package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopArrivalMapper extends AbstractMapper<HopArrival, HopArrivalEntity> {
    public static HopArrivalMapper INSTANCE = Mappers.getMapper(HopArrivalMapper.class);
}
