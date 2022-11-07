package at.fhtw.swen3.persistence.entity.old;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransferwarehouseEntity extends HopEntity {
    @Column
    private String regionGeoJson;

    @Column
    private String logisticsPartner;

    @Column
    private String logisticsPartnerUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass() || !super.equals(o)) {
            return false;
        }
        TransferwarehouseEntity transferwarehouseEntity = (TransferwarehouseEntity) o;
        return regionGeoJson.equals(transferwarehouseEntity.regionGeoJson) &&
                logisticsPartner.equals(transferwarehouseEntity.logisticsPartner) &&
                logisticsPartnerUrl.equals(transferwarehouseEntity.logisticsPartnerUrl);
    }*/

}
