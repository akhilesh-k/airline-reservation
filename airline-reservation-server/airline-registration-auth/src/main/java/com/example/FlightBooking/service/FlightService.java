package com.example.FlightBooking.service;

import com.example.FlightBooking.dto.FlightRequestDTO;
import com.example.FlightBooking.dto.FlightResponseDTO;

import java.util.Date;
import java.util.List;

public interface FlightService {
    List<FlightResponseDTO> searchFlight(String source, String destination);
}
