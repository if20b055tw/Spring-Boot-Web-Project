package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;

public class GeoCoordinateMapperImpl extends GeoCoordinateMapper {
    @Override
    public GeoCoordinateEntity mapToTarget(GeoCoordinate source) {
        if ( source == null ) {
            return null;
        }

        GeoCoordinateEntity.GeoCoordinateEntityBuilder geoCoordinateEntity = GeoCoordinateEntity.builder()
                .location(new GeometryFactory().createPoint(new Coordinate(source.getLon(), source.getLat())));

        return geoCoordinateEntity.build();
    }

    @Override
    public GeoCoordinate mapToSource(GeoCoordinateEntity target) {
        if ( target == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate = new GeoCoordinate();
        geoCoordinate.lon(target.getLocation().getX());
        geoCoordinate.lat(target.getLocation().getY());

        return geoCoordinate;
    }
}
