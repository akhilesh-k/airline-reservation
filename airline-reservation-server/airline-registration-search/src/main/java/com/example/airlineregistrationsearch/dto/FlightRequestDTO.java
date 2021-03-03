package com.example.airlineregistrationsearch.dto;

import com.example.airlineregistrationsearch.entity.FlightSeatClass;
import com.example.airlineregistrationsearch.entity.FlightTripType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class FlightRequestDTO {
	private String source;
	private String destination;
	private String date;
	private Integer person;
	private FlightSeatClass seatClass;
	private FlightTripType tripType;
}
