package at.fhtw.swen3.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WarehouseNextHopsDal {
    @Column
    private Integer traveltimeMins;

    @Column
    @OneToOne
    @NotNull
    private HopDal hop;

    @ManyToOne
    @JoinColumn(name = "fk_warehouse")
    @NotNull
    private WarehouseDal warehouseDal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}