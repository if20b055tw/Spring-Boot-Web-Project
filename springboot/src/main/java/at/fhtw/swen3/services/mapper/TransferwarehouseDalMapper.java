package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.TransferwarehouseDal;
import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class TransferwarehouseDalMapper extends AbstractMapper<TransferwarehouseEntity, TransferwarehouseDal> {
    public static TransferwarehouseDalMapper INSTANCE = Mappers.getMapper(TransferwarehouseDalMapper.class);
}