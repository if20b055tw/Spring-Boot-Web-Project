package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.persistence.entity.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.WarehouseNextHops;
import org.mapstruct.Mapper;

@Mapper
public interface WarehouseNextHopsMapper {
    WarehouseNextHops mapToWarehouseNextHops(WarehouseNextHopsEntity warehouseNextHopsEntity);
    WarehouseNextHopsEntity mapToWarehouseNextHopsEntity(WarehouseNextHops warehouseNextHops);
}
