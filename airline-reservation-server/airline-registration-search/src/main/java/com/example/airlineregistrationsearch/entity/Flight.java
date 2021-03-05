package com.example.airlineregistrationsearch.entity;

import com.example.airlineregistrationsearch.dto.FlightSeatClass;
import com.example.airlineregistrationsearch.dto.FlightTripType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name="flight")
@Data
public class Flight {
	private String airline;
	@EmbeddedId
	private CompositeKey flightId;
	private String source;
	private String destination;
	private String duration;
	private Double price;
	private java.sql.Time arrival;
	private java.sql.Time departure;
}
