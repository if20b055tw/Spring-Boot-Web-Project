package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.HopArrivalDal;
import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopArrivalDalMapper extends AbstractMapper<HopArrivalEntity, HopArrivalDal> {
    public static HopArrivalDalMapper INSTANCE = Mappers.getMapper(HopArrivalDalMapper.class);
}
