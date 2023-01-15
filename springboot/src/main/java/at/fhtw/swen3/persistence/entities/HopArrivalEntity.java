package at.fhtw.swen3.persistence.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;

@Entity(name = "hop_arrival")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HopArrivalEntity {
    @Column
    @Pattern(regexp = "^[A-Z]{4}\\d{1,4}$")
    private String code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="parcel_id")
    @NotNull
    private ParcelEntity parcel;

    @Column
    private String description;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HopArrivalEntity)) {
            return false;
        }
        HopArrivalEntity o = (HopArrivalEntity) other;

        return code.equals(o.code) &&
                description.equals(o.description);
    }
}
