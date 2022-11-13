package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@Mapper
public abstract class GeoCoordinateMapper extends AbstractMapper<GeoCoordinate, GeoCoordinateEntity> {
    //public static GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);
    public static GeoCoordinateMapper INSTANCE = new GeoCoordinateMapperImpl();

    /*@Override
    @Mapping(target="location")
    public abstract GeoCoordinateEntity mapToTarget(GeoCoordinate source);

    @Override
    public abstract GeoCoordinate mapToSource(GeoCoordinateEntity target);*/
}
