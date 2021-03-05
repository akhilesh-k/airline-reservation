package com.example.airlineregistrationsearch.service;


import com.example.airlineregistrationsearch.dto.AddFlightRequestDTO;
import com.example.airlineregistrationsearch.dto.AddFlightResponseDTO;

public interface AddFlightService {

    AddFlightResponseDTO createAddFlight(AddFlightRequestDTO addFlightRequestDTO) ;
}
