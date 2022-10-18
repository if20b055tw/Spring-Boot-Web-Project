package at.fhtw.swen3.persistence.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecipientEntity {
    @Column
    @Pattern(regexp = "[A-Z][A-Za-z0-9- ]*")
    private String name;

    @Column
    @Pattern(regexp = "[A-Za-z]+ [0-9]+[0-9a-z/]*")
    private String street;

    @Column
    @Pattern(regexp = "A-[0-9]{4}")
    private String postalCode;

    @Column
    @Pattern(regexp = "[A-Z][A-Za-z0-9- ]*")
    private String city;

    @Column
    @Pattern(regexp = "[A-Za-zÖöÄäÜü]+")
    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
