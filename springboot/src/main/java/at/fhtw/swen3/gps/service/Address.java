package at.fhtw.swen3.gps.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String street;
    private String postalCode;
    private String city;
    private String country;
}
