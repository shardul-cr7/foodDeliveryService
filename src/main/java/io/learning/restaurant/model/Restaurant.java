package io.learning.restaurant.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Data
@Document(collection= "Restaurant")
public class Restaurant {

    @Id
    private String id;
    private String name;
    private Address address;
    private GeoJsonPoint location;
}
