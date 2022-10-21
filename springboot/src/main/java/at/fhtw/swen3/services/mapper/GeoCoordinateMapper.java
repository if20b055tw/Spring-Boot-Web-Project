package at.fhtw.swen3.services.mapper;
import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.mapstruct.Mapper;

@Mapper
public interface GeoCoordinateMapper {
    GeoCoordinate mapToGeoCoordinate(GeoCoordinateEntity geoCoordinateEntity);
    GeoCoordinateEntity mapToGeoCoordinate(GeoCoordinate geoCoordinate);
}
