package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;

@Mapper
public interface WarehouseMapper {
    Warehouse mapToWarehouse(WarehouseEntity warehouseEntity);
    WarehouseEntity mapToWarehouseEntity(Warehouse warehouse);
}
