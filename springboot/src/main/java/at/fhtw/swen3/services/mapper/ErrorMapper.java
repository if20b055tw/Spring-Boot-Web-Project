package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ErrorEntity;
import at.fhtw.swen3.services.dto.Error;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface ErrorMapper {
    Error mapToError(ErrorEntity errorEntity);
    ErrorEntity mapToErrorEntity(Error error);
}
