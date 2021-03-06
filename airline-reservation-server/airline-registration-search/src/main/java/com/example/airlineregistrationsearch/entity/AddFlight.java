package com.example.airlineregistrationsearch.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

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
    private String arrivalTime;
    private String departureTime;
    private Integer price;

}