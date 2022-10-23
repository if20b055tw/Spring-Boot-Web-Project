package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Warehouse;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class TestWarehouseMapper extends GenericMapperTest<Warehouse, WarehouseEntity> {
    @Override
    public GenericMapper<Warehouse, WarehouseEntity> getMapper() {
        return WarehouseMapper.INSTANCE;
    }

    @Override
    public Warehouse getSource() {
        return new Warehouse()
                .code("codee")
                .hopType("hoptypee")
                .description("descc")
                .processingDelayMins(12)
                .locationCoordinates(new GeoCoordinate().lon(1.0).lat(2.0))
                .locationName("lname")
                .nextHops(new ArrayList<>());
    }

    @Override
    public WarehouseEntity getTarget() {
        return WarehouseEntity.builder()
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
                .nextHops(new ArrayList<>())
                .build();
    }
}
