package com.example.FlightBooking.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class FlightResponseDTO {
    private Integer flightId;
    private String source;
    private String destination;
    private String flightClass;
}
