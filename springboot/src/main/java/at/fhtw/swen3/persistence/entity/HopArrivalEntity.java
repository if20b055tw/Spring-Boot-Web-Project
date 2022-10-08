package at.fhtw.swen3.persistence.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HopArrivalEntity {
    @Column
    private String code;

    @ManyToOne
    @JoinColumn(name="fk_parcel")
    private ParcelEntity parcel;

    @Column
    private String description;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTime;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

}
