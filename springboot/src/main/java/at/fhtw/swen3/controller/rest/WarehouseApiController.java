package at.fhtw.swen3.controller.rest;


import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Error;
import at.fhtw.swen3.services.exceptions.BLDataNotFoundException;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.services.impl.WarehouseService;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.mapper.HopMapper;
import at.fhtw.swen3.services.mapper.WarehouseMapper;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Autowired
    public WarehouseApiController(NativeWebRequest request, WarehouseService warehouseService) {
        this.request = request;
        this.warehouseService = warehouseService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        log.info("Calling: getRequest");
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity exportWarehouses() {
        log.info("Calling: exportWarehouses");
        try {
            Warehouse warehouse = warehouseService.exportWarehouses();
            return new ResponseEntity<Warehouse>(warehouse, HttpStatus.OK);
        } catch (BLDataNotFoundException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Warehouse>(HttpStatus.NOT_FOUND);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }
        /*Pair<Warehouse, ActionResult> result = warehouseService.exportWarehouses();
        switch(result.getSecond().getResult()) {
            case ERROR:
                return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
            case MISSING:
                return new ResponseEntity<Warehouse>(HttpStatus.NOT_FOUND);
            case NO_ERROR:
                return new ResponseEntity<Warehouse>(result.getFirst(), HttpStatus.OK);
        }*/

        //return new ResponseEntity<Warehouse>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity getWarehouse(String code) {
        log.info("Calling: getWarehouse");
        try {
            Hop hop = warehouseService.getWarehouse(code);
            return new ResponseEntity<Hop>(hop, HttpStatus.OK);
        } catch (BLDataNotFoundException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Hop>(HttpStatus.NOT_FOUND);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }
        /*Pair<Hop, ActionResult> hop = warehouseService.getWarehouse(code);
        switch (hop.getSecond().getResult()) {
            case NO_ERROR:
                return new ResponseEntity<Hop>(hop.getFirst(), HttpStatus.OK);
            case MISSING:
                return new ResponseEntity<Hop>(HttpStatus.NOT_FOUND);
            case ERROR:
                return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Hop>(HttpStatus.INTERNAL_SERVER_ERROR);*/
    }

    @Override
    public ResponseEntity importWarehouses(Warehouse warehouse) {
        log.info("Calling: importWarehouse");
        try {
            warehouseService.importWarehouses(warehouse);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (BLException e) {
            log.info(e.getMessage());
            return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
        }

        /*ActionResult actionResult = warehouseService.importWarehouses(warehouse);
        switch (actionResult.getResult()) {
            case ERROR:
                return new ResponseEntity<Error>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);
            case NO_ERROR:
                return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);*/
    }

}
