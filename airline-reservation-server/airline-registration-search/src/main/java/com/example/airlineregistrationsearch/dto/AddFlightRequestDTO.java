package com.example.airlineregistrationsearch.dto;



import com.example.airlineregistrationsearch.entity.CompositeKey;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
public class AddFlightRequestDTO {

    private CompositeKey flightId;
    private String airline;
    private String source;
    private String destination;
    private String arrival;
    private String departure;
    private Integer price;
}
