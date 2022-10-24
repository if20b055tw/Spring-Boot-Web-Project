package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
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
        return new GeoCoordinate().lat(1.0).lon(2.0);
    }

    @Override
    public GeoCoordinateEntity getTarget() {
        return GeoCoordinateEntity.builder().lat(1.0).lon(2.0).build();
    }
}
