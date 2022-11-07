package at.fhtw.swen3.persistence.entity.old;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HopArrivalEntity {
    @Column
    @Pattern(regexp = "^[A-Z]{4}\\d{1,4}$")
    private String code;

    @ManyToOne
    @JoinColumn(name="fk_parcel")
    @NotNull
    private ParcelEntity parcel;

    @Column
    private String description;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTime;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HopArrivalEntity hopArrivalEntity = (HopArrivalEntity) o;
        return code.equals(hopArrivalEntity.code) &&
                description.equals(hopArrivalEntity.description) &&
                dateTime.equals(hopArrivalEntity.dateTime);
    }*/

}
