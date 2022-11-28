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

    @OneToOne
    @NotNull
    private HopEntity hop;

    @ManyToOne
    @JoinColumn(name = "fk_warehouse")
    @NotNull
    private WarehouseEntity warehouseDal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
