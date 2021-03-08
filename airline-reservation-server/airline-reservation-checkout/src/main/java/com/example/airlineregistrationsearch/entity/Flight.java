package com.example.airlineregistrationsearch.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity(name="FlightData")
@Data
public class Flight {
	private String airline;
	@EmbeddedId
	private CompositeKey FlightId;
	private String source;
	private String destination;
	private String duration;
	private Double price;
	private String flightSeatClass;
	private String flightTripType;
	private Integer seats;
}
