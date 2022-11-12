package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ErrorEntity;
import at.fhtw.swen3.services.dto.Error;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ErrorMapper extends AbstractMapper<Error, ErrorEntity> {
    public static ErrorMapper INSTANCE = Mappers.getMapper(ErrorMapper.class);
}
