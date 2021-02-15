package io.learning.restaurant.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class Address {

    private String street1;
    private String street2;
    private String city;
    private String state;
    private int zipcode;
}
