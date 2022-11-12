package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.ErrorEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ErrorDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.ErrorEntity, ErrorEntity> {
    public static ErrorDalMapper INSTANCE = Mappers.getMapper(ErrorDalMapper.class);
}
