package at.fhtw.swen3.services.impl;


import at.fhtw.swen3.services.WarehouseApi;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
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

    @Autowired
    public WarehouseApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Warehouse> exportWarehouses() {
        return WarehouseApi.super.exportWarehouses();
    }

    @Override
    public ResponseEntity<Hop> getWarehouse(String code) {
        return WarehouseApi.super.getWarehouse(code);
    }

    @Override
    public ResponseEntity<Void> importWarehouses(Warehouse warehouse) {
        return WarehouseApi.super.importWarehouses(warehouse);
    }

}
