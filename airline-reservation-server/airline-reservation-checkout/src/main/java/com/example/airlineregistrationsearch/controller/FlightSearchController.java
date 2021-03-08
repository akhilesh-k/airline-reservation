package com.example.airlineregistrationsearch.controller;

import com.example.airlineregistrationsearch.dto.FlightRequestDTO;
import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class FlightSearchController {
	@Autowired
	private FlightSearchService flightSearchService;

	@GetMapping("/{source}/{destination}/{date}/{fId}")
	public List<FlightResponseDTO> flightSearch(@PathVariable("source") String source, @PathVariable("destination") String destination,@PathVariable("date") String date,@PathVariable("fId") String fId) {
		return flightSearchService.searchFlight(source,destination,date,fId);
	}
	@PostMapping("/checkout")
	public Integer updateFlightBooking(@RequestBody FlightRequestDTO flightRequestDTO){
		return flightSearchService.updateFlightBooking(flightRequestDTO);
	}
}
