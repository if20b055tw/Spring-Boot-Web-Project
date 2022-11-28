package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;

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
