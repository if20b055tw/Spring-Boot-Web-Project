package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses=GeoCoordinateMapperImpl.class)
public abstract class TransferwarehouseMapper extends AbstractMapper<Transferwarehouse, TransferwarehouseEntity> {
    public static TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);
}
