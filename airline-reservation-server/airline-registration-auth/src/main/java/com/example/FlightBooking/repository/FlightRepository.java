package com.example.FlightBooking.repository;

import com.example.FlightBooking.entity.Flight;
import com.example.FlightBooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight,Integer> {

}
