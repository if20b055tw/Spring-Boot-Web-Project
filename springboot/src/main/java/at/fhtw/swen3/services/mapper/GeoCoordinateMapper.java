package at.fhtw.swen3.services.mapper;
import at.fhtw.swen3.persistence.entity.old.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class GeoCoordinateMapper extends AbstractMapper<GeoCoordinate, GeoCoordinateEntity> {
    public static GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);
}
