package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
@TestPropertySource("/application.properties")
public class TestHopRepository {
    @Autowired
    private HopRepository hopRepository;
    @Autowired
    private GeoCoordinateRepository geoCoordinateRepository;

    private HopEntity getHopEntity(){
        return HopEntity.builder()
                .hopType("hop type")
                .code("codde")
                .description("descc")
                .processingDelayMins(10)
                .locationCoordinates(
                        GeoCoordinateEntity.builder()
                                .location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0)))
                                .build())
                .locationName("lname")
                .build();
    }

    /*@Test
    public void testHopRepository() {
        Assertions.assertEquals(0, hopRepository.count());

        HopEntity hopEntity = getHopEntity();
        GeoCoordinateEntity geoCoordinateEntity = hopEntity.getLocationCoordinates();

        geoCoordinateRepository.save(geoCoordinateEntity);
        hopRepository.save(hopEntity);
        Assertions.assertEquals(1, hopRepository.count());

        Optional<HopEntity> entity = hopRepository.findByCode("codde");
        Assertions.assertTrue(entity.isPresent());
        Assertions.assertEquals(hopEntity, entity.get());

        hopRepository.delete(hopEntity);
        Assertions.assertEquals(0, hopRepository.count());
    }*/


}
