package at.fhtw.swen3.persistence.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecipientEntity {
    @Column
    private String name;

    @Column
    private String street;

    @Column
    private String postalCode;

    @Column
    private String city;

    @Column
    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;
}
