package at.fhtw.swen3.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HopEntity {
    @Column
    private String hopType;

    @Column
    private String code;

    @Column
    private String description;

    @Column
    private Integer processingDelayMins;

    @Column
    private String locationName;

    @OneToOne
    @NotNull
    private GeoCoordinateEntity locationCoordinates;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HopEntity hopEntity = (HopEntity) o;
        return hopType.equals(hopEntity.hopType) &&
                code.equals(hopEntity.code) &&
                description.equals(hopEntity.description) &&
                processingDelayMins.equals(hopEntity.processingDelayMins) &&
                locationName.equals(hopEntity.locationName) &&
                locationCoordinates.equals(hopEntity.locationCoordinates);
    }*/
}
