package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ParcelDalMapper extends AbstractMapper<ParcelEntity, ParcelDal> {
    public static ParcelDalMapper INSTANCE = Mappers.getMapper(ParcelDalMapper.class);
}
