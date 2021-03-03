package com.example.airlineregistrationsearch.controller;

import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class FlightSearchController {
	@Autowired
	private FlightSearchService flightSearchService;

	@GetMapping("/{source}/{destination}")
	public List<FlightResponseDTO> flightSearch(@PathVariable("source") String source, @PathVariable("destination") String destination) {
		return flightSearchService.searchFlight(source, destination);
	}
}
