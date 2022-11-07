package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.RecipientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class RecipientDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.RecipientEntity, RecipientEntity> {
    public static RecipientDalMapper INSTANCE = Mappers.getMapper(RecipientDalMapper.class);
}
