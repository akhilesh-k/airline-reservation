package com.example.airlineregistrationsearch.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity(name="flight")
@Data
public class Flight {
	private String airline;
	@Id
	private String fId;
	private String source;
	private String destination;
	private String duration;
	private Date date;
	private Double price;
	@Enumerated(EnumType.STRING)
	private FlightSeatClass seatClass;
	@Enumerated(EnumType.STRING)
	private FlightTripType tripType;
}
