package at.fhtw.swen3.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WarehouseNextHopsEntity {
    @Column
    private Integer traveltimeMins;

    @Column
    @OneToOne
    private HopEntity hop;

    @ManyToOne
    @JoinColumn(name = "fk_warehouse")
    private WarehouseEntity warehouseEntity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
