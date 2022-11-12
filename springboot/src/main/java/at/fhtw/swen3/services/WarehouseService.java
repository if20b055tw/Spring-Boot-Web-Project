package at.fhtw.swen3.services;

import at.fhtw.swen3.controller.rest.WarehouseApi;
import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public interface WarehouseService {
    WarehouseEntity exportWarehouses();
    HopEntity getWarehouse(String code);
    void importWarehouses(WarehouseEntity warehouse);
}
