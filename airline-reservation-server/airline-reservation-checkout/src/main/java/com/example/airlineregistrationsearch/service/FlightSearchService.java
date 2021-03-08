package com.example.airlineregistrationsearch.service;

import com.example.airlineregistrationsearch.dto.FlightRequestDTO;
import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

public interface FlightSearchService {
	List<FlightResponseDTO> searchFlight(String source, String destination, String date,String fId);
	Integer updateFlightBooking(FlightRequestDTO flightRequestDTO);
}
