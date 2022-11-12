package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class TransferwarehouseDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.TransferwarehouseEntity, TransferwarehouseEntity> {
    public static TransferwarehouseDalMapper INSTANCE = Mappers.getMapper(TransferwarehouseDalMapper.class);
}
