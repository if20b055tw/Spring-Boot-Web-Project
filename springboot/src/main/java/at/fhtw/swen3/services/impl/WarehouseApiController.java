package at.fhtw.swen3.services.impl;


import at.fhtw.swen3.controller.rest.WarehouseApi;
import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.WarehouseService;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.mapper.HopMapper;
import at.fhtw.swen3.services.mapper.WarehouseMapper;
import at.fhtw.swen3.services.validation.MyValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-20T11:34:14.505164Z[Etc/UTC]")
@Controller
public class WarehouseApiController implements WarehouseApi {

    private final NativeWebRequest request;

    private final WarehouseService warehouseService;

    private final WarehouseMapper warehouseMapper;

    private final HopMapper hopMapper;
    @Autowired
    public WarehouseApiController(NativeWebRequest request, WarehouseService warehouseService, WarehouseMapper warehouseMapper, HopMapper hopMapper) {
        this.request = request;
        this.warehouseService = warehouseService;
        this.warehouseMapper = warehouseMapper;
        this.hopMapper = hopMapper;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Warehouse> exportWarehouses() {
        WarehouseEntity warehouseEntity = warehouseService.exportWarehouses();
        Warehouse warehouse = warehouseMapper.mapToSource(warehouseEntity);

        return WarehouseApi.super.exportWarehouses();
    }

    @Override
    public ResponseEntity<Hop> getWarehouse(String code) {
        HopEntity hopEntity = warehouseService.getWarehouse(code);
        Hop hop = hopMapper.mapToSource(hopEntity);

        return WarehouseApi.super.getWarehouse(code);
    }

    @Override
    public ResponseEntity<Void> importWarehouses(Warehouse warehouse) {
        WarehouseEntity warehouseEntity = warehouseMapper.mapToTarget(warehouse);
        warehouseService.importWarehouses(warehouseEntity);

        return WarehouseApi.super.importWarehouses(warehouse);
    }

}
