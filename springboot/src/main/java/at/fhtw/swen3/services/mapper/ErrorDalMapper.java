package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ErrorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ErrorDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.ErrorEntity, ErrorEntity> {
    public static ErrorDalMapper INSTANCE = Mappers.getMapper(ErrorDalMapper.class);
}
