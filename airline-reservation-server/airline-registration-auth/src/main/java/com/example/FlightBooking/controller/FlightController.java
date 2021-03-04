package com.example.FlightBooking.controller;

import com.example.FlightBooking.dto.FlightRequestDTO;
import com.example.FlightBooking.dto.FlightResponseDTO;
import com.example.FlightBooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("/{source}/{destination}")
    public List<FlightResponseDTO> searchFlight(@PathVariable("source") String source, @PathVariable("destination") String destination)
    {
        return flightService.searchFlight(source,destination);
    }
}
