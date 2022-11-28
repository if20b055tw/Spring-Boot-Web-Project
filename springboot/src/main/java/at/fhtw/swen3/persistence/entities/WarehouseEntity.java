package at.fhtw.swen3.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "warehouse")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
/*@ConstraintOverrides({
        @ConstraintOverride(name="description", constraint={@Pattern(regexp = "[A-ZÄÖÜa-zäöüß0-9-/ ]*")})
})*/
public class WarehouseEntity extends HopEntity {
    @Column
    private Integer level;

    @Column
    @OneToMany
    @NotNull
    private List<@NotNull WarehouseNextHopsEntity> nextHops = new ArrayList<>();

    /*@Column
    @Pattern(regexp = "[A-ZÄÖÜa-zäöüß0-9-/ ]*")
    private String description;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof WarehouseEntity)) {
            return false;
        }
        WarehouseEntity o = (WarehouseEntity) other;

        return super.equals(other) &&
                level.equals(o.level);// &&
                //description.equals(o.description);
    }

}
