package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class WarehouseServiceImpl implements WarehouseService {

    private final MyValidator myValidator;

    @Override
    public WarehouseEntity exportWarehouses() {
        log.info("Calling: exportWarehouses()");
        return null;
    }

    @Override
    public Pair<HopEntity, ActionResult> getWarehouse(String code) {
        log.info("get the Warehouse with Code: " + code);
        return null;
    }

    @Override
    public void importWarehouses(WarehouseEntity warehouseEntity) {
        log.info("Calling: importWarehouses");
    }
}
