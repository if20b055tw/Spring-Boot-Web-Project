package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.WarehouseService;
import at.fhtw.swen3.services.mapper.WarehouseMapper;
import at.fhtw.swen3.services.validation.MyValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {

    private final MyValidator myValidator;

    @Override
    public WarehouseEntity exportWarehouses() {
        return null;
    }

    @Override
    public HopEntity getWarehouse(String code) {
        return null;
    }

    @Override
    public void importWarehouses(WarehouseEntity warehouse) {

    }
}
