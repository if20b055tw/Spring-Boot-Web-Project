package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.HopArrival;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.dto.TrackingInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;



@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParcelEntity {
    @Column
    @Min(0)
    private Float weight;

    @OneToOne
    @NotNull
    private RecipientEntity recipient;

    @OneToOne
    @NotNull
    private RecipientEntity sender;

    @Column
    private TrackingInformation.StateEnum state;

    @OneToMany(mappedBy = "parcel")
    private List<HopArrivalEntity> visitedHops = new ArrayList<>();

    @OneToMany(mappedBy = "parcel")
    private List<HopArrivalEntity> futureHops = new ArrayList<>();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    @Column
    private String trackingId;

}
