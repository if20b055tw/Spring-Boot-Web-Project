package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class GeoCoordinateDalMapper extends AbstractMapper<at.fhtw.swen3.persistence.entity.old.GeoCoordinateEntity, GeoCoordinateEntity> {
    public static GeoCoordinateDalMapper INSTANCE = Mappers.getMapper(GeoCoordinateDalMapper.class);
}
