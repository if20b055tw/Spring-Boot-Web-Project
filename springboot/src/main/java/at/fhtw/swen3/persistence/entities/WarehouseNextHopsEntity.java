package at.fhtw.swen3.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "warehouse_next_hops")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WarehouseNextHopsEntity {
    @Column
    private Integer traveltimeMins;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private HopEntity hop;

    /*@ManyToOne
    @JoinColumn(name = "warehouse_id")
    //@NotNull
    private WarehouseEntity warehouse;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
