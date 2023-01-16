package at.fhtw.swen3.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name  = "hop")
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

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private GeoCoordinateEntity locationCoordinates;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HopEntity)) {
            return false;
        }
        HopEntity o = (HopEntity) other;

        return hopType.equals(o.hopType) &&
                code.equals(o.code) &&
                description.equals(o.description) &&
                processingDelayMins.equals(o.processingDelayMins) &&
                locationName.equals(o.locationName) &&
                locationCoordinates.equals(o.locationCoordinates);
    }
}
