package com.example.airlineregistrationsearch.repository;

import com.example.airlineregistrationsearch.entity.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight,String> {
//	List<Flight>getFlightListByNativeQuery(Integer flightId);
}
