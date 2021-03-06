package com.example.airlineregistrationsearch.controller;

import com.example.airlineregistrationsearch.dto.AddFlightRequestDTO;
import com.example.airlineregistrationsearch.dto.AddFlightResponseDTO;
import com.example.airlineregistrationsearch.service.AddFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/flights")

public class AddFlightController {
    @Autowired
    private AddFlightService addFlightService;

    //POST - /addingflights
    @PostMapping
    public AddFlightResponseDTO createAddFlight(@RequestBody AddFlightRequestDTO addFlightRequestDTO){
        return addFlightService.createAddFlight(addFlightRequestDTO);
    }
}


