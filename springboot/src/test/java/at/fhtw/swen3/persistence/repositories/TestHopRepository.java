package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.HopEntity;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHopRepository {
    @Autowired
    private HopRepository repository;

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


}
