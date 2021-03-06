package com.example.airlineregistrationsearch.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity(name="flights")
@Getter
@Setter
@Data
public class AddFlight {

    @EmbeddedId
    private CompositeKey flightId;
    private String airline;
    private String source;
    private String destination;
    private String arrival;
    private String departure;
    private Integer price;

}