package at.fhtw.swen3.persistence.entity;

import com.vividsolutions.jts.geom.Point;
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
    /*@Column
    private Double lat;

    @Column
    private Double lon;*/

    @Column
    private Point location;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;
}
