package com.example.airlineregistrationsearch.controller;

import com.example.airlineregistrationsearch.dto.FlightRequestDTO;
import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class FlightSearchController {
	@Autowired
	private FlightSearchService flightSearchService;

	@PostMapping("/search")
	public List<FlightResponseDTO> flightSearch(@RequestBody FlightRequestDTO flightRequestDTO) {
		return flightSearchService.searchFlight(flightRequestDTO);
	}
}
