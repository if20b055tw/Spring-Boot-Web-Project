package at.fhtw.swen3.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "truck")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TruckEntity extends HopEntity {
    @Column
    @Lob
    private String regionGeoJson;

    @Column
    private String numberPlate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

}
