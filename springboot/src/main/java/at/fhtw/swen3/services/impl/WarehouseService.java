package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;

public interface WarehouseService {
    Warehouse exportWarehouses();
    Pair<Hop, ActionResult> getWarehouse(String code);
    void importWarehouses(Warehouse warehouse);
}
