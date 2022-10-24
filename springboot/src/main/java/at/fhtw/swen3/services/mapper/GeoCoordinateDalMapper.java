package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.model.entities.GeoCoordinateDal;
import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class GeoCoordinateDalMapper extends AbstractMapper<GeoCoordinateEntity, GeoCoordinateDal> {
    public static GeoCoordinateDalMapper INSTANCE = Mappers.getMapper(GeoCoordinateDalMapper.class);
}
