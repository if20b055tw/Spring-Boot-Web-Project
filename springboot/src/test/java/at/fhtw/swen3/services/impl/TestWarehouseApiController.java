package at.fhtw.swen3.services.impl;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestWarehouseApiController {
    /*private final WarehouseMapper warehouseMapper;
    private final HopMapper hopMapper;

    private HopEntity getHopEntity(){
        return HopEntity.builder()
                .hopType("hop type")
                .code("GoodCodeExample")
                .description("descc")
                .processingDelayMins(10)
                .locationCoordinates(
                        GeoCoordinateEntity.builder()
                                .location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0)))
                                .build())
                .locationName("lname")
                .build();
    }

    private Hop getHop(){
        return hopMapper.mapToSource(getHopEntity());
    }

    private String getGoodCode(){
        return "GoodCodeExample";
    }

    private String getMissingCode(){
        return "";
    }

    private String getTerribleCode(){
        return "TerribleCode";
    }

    public TestWarehouseApiController(){
        this.warehouseMapper = WarehouseMapper.INSTANCE;
        this.hopMapper = HopMapper.INSTANCE;


    }

    public WarehouseApi getWarehouseApi(WarehouseService mockedWarehouseService) {
        return new WarehouseApiController(null, mockedWarehouseService,
                this.warehouseMapper, this.hopMapper);
    }

    @Test
    public void testExportWarehouses(){

    }

    @Test
    public void testGetWarehouse(){
        WarehouseService warehouseService = Mockito.mock(WarehouseService.class);
        Mockito.when(warehouseService.getWarehouse(getGoodCode())).thenReturn(new Pair<>(getHopEntity(), ActionResult.NO_ERROR));
        WarehouseApi warehouseApi = getWarehouseApi(warehouseService);
        ResponseEntity<Hop> expected = new ResponseEntity<>(getHop(), HttpStatus.OK);

        ResponseEntity<Hop> response = warehouseApi.getWarehouse(getGoodCode());

        Assertions.assertEquals(expected, response);

    }

    @Test
    public void testGetWarehouseError(){
        WarehouseService warehouseService = Mockito.mock(WarehouseService.class);
        Mockito.when(warehouseService.getWarehouse(getTerribleCode())).thenReturn(new Pair<>(null, ActionResult.ERROR));
        WarehouseApi warehouseApi = getWarehouseApi(warehouseService);
        ResponseEntity<?> expected = new ResponseEntity<>(new Error().errorMessage("The operation failed due to an error."), HttpStatus.BAD_REQUEST);

        ResponseEntity<?> response = warehouseApi.getWarehouse(getTerribleCode());

        Assertions.assertEquals(expected, response);

    }

    @Test
    public void testGetWarehouseMissing(){
        WarehouseService warehouseService = Mockito.mock(WarehouseService.class);
        Mockito.when(warehouseService.getWarehouse(getMissingCode())).thenReturn(new Pair<>(null, ActionResult.MISSING));
        WarehouseApi warehouseApi = getWarehouseApi(warehouseService);
        ResponseEntity<Hop> expected = new ResponseEntity<>(HttpStatus.NOT_FOUND);

        ResponseEntity<Hop> response = warehouseApi.getWarehouse(getMissingCode());

        Assertions.assertEquals(expected, response);

    }*/



}
