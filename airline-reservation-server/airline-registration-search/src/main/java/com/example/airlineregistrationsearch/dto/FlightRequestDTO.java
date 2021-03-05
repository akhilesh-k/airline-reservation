package com.example.airlineregistrationsearch.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightRequestDTO {
	private String source;
	private String destination;
	private java.sql.Date date;
	private Integer person;
}
