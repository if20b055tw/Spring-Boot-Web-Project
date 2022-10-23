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

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientEntity recipientEntity = (RecipientEntity) o;
        return name.equals(recipientEntity.name) &&
                street.equals(recipientEntity.street) &&
                postalCode.equals(recipientEntity.postalCode) &&
                city.equals(recipientEntity.city) &&
                country.equals(recipientEntity.country);
    }*/
}
