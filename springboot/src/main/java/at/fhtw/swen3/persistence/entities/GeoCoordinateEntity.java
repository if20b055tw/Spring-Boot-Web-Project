package at.fhtw.swen3.persistence.entities;

import com.vividsolutions.jts.geom.Point;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "geo_coordinate")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GeoCoordinateEntity {
    /*@Column
    private Double lat;

    @Column
    private Double lon;*/

    @Column
    private Point location;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof GeoCoordinateEntity)) {
            return false;
        }
        GeoCoordinateEntity o = (GeoCoordinateEntity) other;

        return location.equals(o.location);
    }
}
