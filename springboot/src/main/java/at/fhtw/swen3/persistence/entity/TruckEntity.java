package at.fhtw.swen3.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TruckEntity extends HopEntity {
    @Column
    private String regionGeoJson;

    @Column
    private String numberPlate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass() || !super.equals(o)) {
            return false;
        }
        TruckEntity truckEntity = (TruckEntity) o;
        return regionGeoJson.equals(truckEntity.regionGeoJson) &&
                numberPlate.equals(truckEntity.numberPlate);
    }*/

}
