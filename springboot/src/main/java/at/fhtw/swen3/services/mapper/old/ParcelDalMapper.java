package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ParcelDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.ParcelEntity, ParcelEntity> {
    public static ParcelDalMapper INSTANCE = Mappers.getMapper(ParcelDalMapper.class);
}
