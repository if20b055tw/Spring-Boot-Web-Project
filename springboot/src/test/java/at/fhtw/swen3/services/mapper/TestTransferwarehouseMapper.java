package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestTransferwarehouseMapper extends GenericMapperTest<Transferwarehouse, TransferwarehouseEntity> {
    @Override
    public GenericMapper<Transferwarehouse, TransferwarehouseEntity> getMapper() {
        return TransferwarehouseMapper.INSTANCE;
    }

    @Override
    public Transferwarehouse getSource() {
        return new Transferwarehouse()
                .code("codee")
                .hopType("hoptypee")
                .description("descc")
                .processingDelayMins(12)
                .locationCoordinates(new GeoCoordinate().lon(1.0).lat(2.0))
                .locationName("lname")
                .logisticsPartner("lpartner")
                .logisticsPartnerUrl("lpurl")
                .regionGeoJson("JSON");
    }

    @Override
    public TransferwarehouseEntity getTarget() {
        return TransferwarehouseEntity.builder()
                .code("codee")
                .hopType("hoptypee")
                .description("descc")
                .processingDelayMins(12)
                .locationCoordinates(
                        GeoCoordinateEntity.builder()
                                .location(new GeometryFactory().createPoint(new Coordinate(1.0, 2.0)))
                                .build())
                .locationName("lname")
                .logisticsPartner("lpartner")
                .logisticsPartnerUrl("lpurl")
                .regionGeoJson("JSON")
                .build();
    }
}
