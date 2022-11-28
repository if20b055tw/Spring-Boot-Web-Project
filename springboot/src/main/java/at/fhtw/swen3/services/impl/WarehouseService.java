package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;

public interface WarehouseService {
    WarehouseEntity exportWarehouses();
    Pair<HopEntity, ActionResult> getWarehouse(String code);
    void importWarehouses(WarehouseEntity warehouseEntity);
}
