package com.example.airlineregistrationsearch.repository;

import com.example.airlineregistrationsearch.entity.CompositeKey;
import com.example.airlineregistrationsearch.entity.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight, CompositeKey> {
//	List<Flight>getFlightListByNativeQuery(Integer flightId);


	@Query(value = "select * from flight where source = ?1 and destination = ?2 and date=?3", nativeQuery = true)
	List<Flight> getFlightBySourceAndDestination(String source, String destination, java.sql.Date date);
}
