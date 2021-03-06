package com.example.airlineregistrationsearch.dto;



import com.example.airlineregistrationsearch.entity.CompositeKey;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
public class AddFlightRequestDTO {

    private CompositeKey flightId;
    private String airline;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private Date date;
    private Integer price;
}
