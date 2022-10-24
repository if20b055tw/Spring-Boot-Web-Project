package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.ErrorDal;
import at.fhtw.swen3.persistence.entity.ErrorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ErrorDalMapper extends AbstractMapper<ErrorEntity, ErrorDal> {
    public static ErrorDalMapper INSTANCE = Mappers.getMapper(ErrorDalMapper.class);
}
