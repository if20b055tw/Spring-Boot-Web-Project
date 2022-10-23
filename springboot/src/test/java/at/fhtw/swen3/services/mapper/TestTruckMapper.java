package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.TruckEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Truck;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestTruckMapper extends GenericMapperTest<Truck, TruckEntity> {
    @Override
    public GenericMapper<Truck, TruckEntity> getMapper() {
        return TruckMapper.INSTANCE;
    }

    @Override
    public Truck getSource() {
        return new Truck()
                .code("codee")
                .hopType("hoptypee")
                .description("descc")
                .processingDelayMins(12)
                .locationCoordinates(new GeoCoordinate().lon(1.0).lat(2.0))
                .locationName("lname")
                .regionGeoJson("JSON")
                .numberPlate("1234-XYZ");
    }

    @Override
    public TruckEntity getTarget() {
        return TruckEntity.builder()
                .code("codee")
                .hopType("hoptypee")
                .description("descc")
                .processingDelayMins(12)
                .locationCoordinates(
                        GeoCoordinateEntity.builder()
                                .lon(1.0)
                                .lat(2.0)
                                .build())
                .locationName("lname")
                .regionGeoJson("JSON")
                .numberPlate("1234-XYZ")
                .build();
    }
}
