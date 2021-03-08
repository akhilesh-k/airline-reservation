package com.example.airlineregistrationsearch.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FlightResponseDTO {
	private String Airline;
	private String fId;
	private String source;
	private String destination;
	private String date;
	private Double price;
	private Integer seats;
}
