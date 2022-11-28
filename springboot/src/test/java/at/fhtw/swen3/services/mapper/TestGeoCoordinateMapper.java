package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestGeoCoordinateMapper extends GenericMapperTest<GeoCoordinate, GeoCoordinateEntity> {
    @Override
    public GenericMapper<GeoCoordinate, GeoCoordinateEntity> getMapper() {
        return GeoCoordinateMapper.INSTANCE;
    }

    @Override
    public GeoCoordinate getSource() {
        return new GeoCoordinate().lon(1.0).lat(2.0);
    }

    @Override
    public GeoCoordinateEntity getTarget() {
        return GeoCoordinateEntity.builder().location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0))).build();
    }
}
