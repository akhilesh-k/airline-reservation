package com.example.airlineregistrationsearch.dto;

import com.example.airlineregistrationsearch.entity.CompositeKey;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FlightResponseDTO {
	private String Airline;
	private CompositeKey flightId;
	private String source;
	private String destination;
	private Double price;
	private String duration;
	private java.sql.Time arrival;
	private java.sql.Time departure;
}
