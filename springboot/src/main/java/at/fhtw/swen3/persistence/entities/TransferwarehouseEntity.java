package at.fhtw.swen3.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "transferwarehouse")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransferwarehouseEntity extends HopEntity {
    @Column
    @Lob
    private String regionGeoJson;

    @Column
    private String logisticsPartner;

    @Column
    private String logisticsPartnerUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

}
