package at.fhtw.swen3.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GeoCoordinateEntity {
    @Column
    private Double lat;

    @Column
    private Double lon;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeoCoordinateEntity geoCoordinateEntity = (GeoCoordinateEntity) o;
        return lat.equals(geoCoordinateEntity.lat) &&
                lon.equals(geoCoordinateEntity.lon);
    }*/
}
