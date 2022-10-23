package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.TrackingInformation;
import lombok.*;

import javax.persistence.*;
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
    @NotNull
    private List<@NotNull HopArrivalEntity> visitedHops = new ArrayList<>();

    @OneToMany(mappedBy = "parcel")
    @NotNull
    private List<@NotNull HopArrivalEntity> futureHops = new ArrayList<>();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    @Column
    private String trackingId;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParcelEntity parcelEntity = (ParcelEntity) o;
        return weight.equals(parcelEntity.weight) &&
                recipient.equals(parcelEntity.recipient) &&
                sender.equals(parcelEntity.sender) &&
                state.equals(parcelEntity.state) &&
                visitedHops.equals(parcelEntity.visitedHops) &&
                futureHops.equals(parcelEntity.futureHops);
    }*/

}
