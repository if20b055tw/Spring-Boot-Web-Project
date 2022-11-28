package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.Optional;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
@TestPropertySource("/application.properties")
public class TestWarehouseRepository {
    @Autowired
    private WarehouseRepository warehouseRepository;

    @Autowired
    private GeoCoordinateRepository geoCoordinateRepository;

    private WarehouseEntity getWarehouseEntity(){
        return WarehouseEntity.builder()
                .code("codee")
                .hopType("hoptypee")
                .description("")
                .processingDelayMins(12)
                .locationCoordinates(
                        GeoCoordinateEntity.builder()
                                .location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0)))
                                .build())
                .locationName("lname")
                .nextHops(new ArrayList<>())
                .level(1)
                .build();


    }

/*    @Test
    public void testWarehouserepository(){
        Assertions.assertEquals(0, warehouseRepository.count());

        WarehouseEntity warehouseEntity = getWarehouseEntity();
        GeoCoordinateEntity geoCoordinateEntity = warehouseEntity.getLocationCoordinates();

        geoCoordinateRepository.save(geoCoordinateEntity);
        warehouseRepository.save(warehouseEntity);
        Assertions.assertEquals(1, warehouseRepository.count());

        Optional<WarehouseEntity> entity = warehouseRepository.findByCode("codee");
        Assertions.assertTrue(entity.isPresent());
        Assertions.assertEquals(warehouseEntity, entity.get());

        warehouseRepository.delete(warehouseEntity);
        Assertions.assertEquals(0, warehouseRepository.count());
    }*/
}
