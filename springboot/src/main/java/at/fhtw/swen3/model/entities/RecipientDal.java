package at.fhtw.swen3.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecipientDal {
    @Column
    @Pattern(regexp = "[A-ZÄÖÜ][A-ZÄÖÜa-zäöüß0-9-/ ]*")
    private String name;

    @Column
    @Pattern(regexp = "[A-ZÄÖÜa-zäöüß]+ [1-9][0-9]*[0-9a-zA-Z/]*")
    private String street;

    @Column
    @Pattern(regexp = "A-[0-9]{4}")
    private String postalCode;

    @Column
    @Pattern(regexp = "[A-ZÄÖÜ][A-ZÄÖÜa-zäöüß0-9-/ ]*")
    private String city;

    @Column
    @Pattern(regexp = "[A-ZÄÖÜa-zäöüß]+")
    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
