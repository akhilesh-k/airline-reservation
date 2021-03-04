package com.example.FlightBooking.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class FlightRequestDTO {
    private String source;
    private String destination;
    private String flightClass;
}
