package com.example.FlightBooking.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Flight
{
    @Id
    @GenericGenerator(name = "flight_id_seq", strategy = "increment")
    @GeneratedValue(generator = "flight_id_seq", strategy = GenerationType.AUTO)
    private Integer flightId;
    private String source;
    private String destination;
    private String flightClass;
}
