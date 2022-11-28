package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Hop;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHopMapper extends GenericMapperTest<Hop, HopEntity> {
    @Override
    public GenericMapper<Hop, HopEntity> getMapper() {
        return HopMapper.INSTANCE;
    }

    @Override
    public Hop getSource() {
        return new Hop()
                .hopType("hop type")
                .code("codde")
                .description("descc")
                .processingDelayMins(10)
                .locationCoordinates(
                        new GeoCoordinate()
                                .lon(1.0)
                                .lat(2.0))
                .locationName("lname");
    }

    @Override
    public HopEntity getTarget() {
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
