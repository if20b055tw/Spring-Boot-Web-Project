package at.fhtw.swen3.controller.rest;


import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.impl.WarehouseService;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.mapper.HopMapper;
import at.fhtw.swen3.services.mapper.WarehouseMapper;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-20T11:34:14.505164Z[Etc/UTC]")
@Controller
@Slf4j
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
        log.info("Calling: getRequest");
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Warehouse> exportWarehouses() {
        log.info("Calling: exportWarehouses");
        WarehouseEntity warehouseEntity = warehouseService.exportWarehouses();
        Warehouse warehouse = warehouseMapper.mapToSource(warehouseEntity);

        return WarehouseApi.super.exportWarehouses();
    }

    @Override
    public ResponseEntity getWarehouse(String code) {
        log.info("Calling: getWarehouse");
        Pair<HopEntity, ActionResult> hopEntity = warehouseService.getWarehouse(code);
        /*switch (hopEntity.getSecond().getResult()) {
            case NO_ERROR:
                Hop hop = hopMapper.mapToSource(hopEntity.getFirst());
                return new ResponseEntity<Hop>(hop, HttpStatus.OK);
            case MISSING:
                return new ResponseEntity<Hop>(HttpStatus.NOT_FOUND);
            case ERROR:
                return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }*/

        return WarehouseApi.super.getWarehouse(code);
    }

    @Override
    public ResponseEntity<Void> importWarehouses(Warehouse warehouse) {
        log.info("Calling: importWarehouse");
        WarehouseEntity warehouseEntity = warehouseMapper.mapToTarget(warehouse);
        warehouseService.importWarehouses(warehouseEntity);

        return WarehouseApi.super.importWarehouses(warehouse);
    }

}
