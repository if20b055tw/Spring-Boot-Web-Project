package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.HopDal;
import at.fhtw.swen3.persistence.entity.HopEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class HopDalMapper extends AbstractMapper<HopEntity, HopDal> {
    public static HopDalMapper INSTANCE = Mappers.getMapper(HopDalMapper.class);
}
