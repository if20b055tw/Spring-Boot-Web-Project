package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.WarehouseNextHops;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestWarehouseNextHopsMapper extends GenericMapperTest<WarehouseNextHops, WarehouseNextHopsEntity> {
    @Override
    public GenericMapper<WarehouseNextHops, WarehouseNextHopsEntity> getMapper() {
        return WarehouseNextHopsMapper.INSTANCE;
    }

    @Override
    public WarehouseNextHops getSource() {
        return new WarehouseNextHops()
                .hop(new Hop()
                        .hopType("hop type")
                        .code("codde")
                        .description("descc")
                        .processingDelayMins(10)
                        .locationCoordinates(
                                new GeoCoordinate()
                                        .lon(1.0)
                                        .lat(2.0))
                        .locationName("lname"))
                .traveltimeMins(20);
    }

    @Override
    public WarehouseNextHopsEntity getTarget() {
        return WarehouseNextHopsEntity.builder()
                .hop(HopEntity.builder()
                        .hopType("hop type")
                        .code("codde")
                        .description("descc")
                        .processingDelayMins(10)
                        .locationCoordinates(
                                GeoCoordinateEntity.builder()
                                        .location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0)))
                                        .build())
                        .locationName("lname")
                        .build())
                .traveltimeMins(20)
                .build();
    }
}
