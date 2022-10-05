package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.HopArrival;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.dto.TrackingInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class ParcelEntity {
    @Column
    private Float weight;

    @OneToOne
    private Recipient recipient;

    @OneToOne
    private Recipient sender;

    @Column
    private TrackingInformation.StateEnum state;

    @OneToMany(mappedBy = "parcel")
    private List<HopArrival> visitedHops = new ArrayList<>();

    @OneToMany(mappedBy = "parcel")
    private List<HopArrival> futureHops = new ArrayList<>();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private String trackingId;

}
