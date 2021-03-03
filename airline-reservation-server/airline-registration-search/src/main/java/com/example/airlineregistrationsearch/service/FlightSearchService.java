package com.example.airlineregistrationsearch.service;

import com.example.airlineregistrationsearch.dto.FlightResponseDTO;

import java.util.Date;
import java.util.List;

public interface FlightSearchService {
	List<FlightResponseDTO> searchFlight(String source, String destination);
}
