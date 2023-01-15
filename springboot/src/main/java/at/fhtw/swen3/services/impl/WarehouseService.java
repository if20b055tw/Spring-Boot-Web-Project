package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.HopEntity;

import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.exceptions.BLDataNotFoundException;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;

public interface WarehouseService {
    Warehouse exportWarehouses() throws BLException;
    Hop getWarehouse(String code) throws BLException;
    void importWarehouses(Warehouse warehouse) throws BLException;
}
