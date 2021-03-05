package com.example.airlineregistrationsearch.service.impl;

import com.example.airlineregistrationsearch.dto.FlightRequestDTO;
import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.entity.Flight;
import com.example.airlineregistrationsearch.repository.FlightRepository;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {
	@Autowired
	private FlightRepository flightRepository;


	public List<FlightResponseDTO> searchFlight(FlightRequestDTO flightRequestDTO) {
		 String source=flightRequestDTO.getSource();
		 String destination=flightRequestDTO.getDestination();
		java.sql.Date date=flightRequestDTO.getDate();

		List<FlightResponseDTO> flightList = new ArrayList<>();

		List<Flight> databaseResponse = flightRepository.getFlightBySourceAndDestination(source, destination, date);

		for (Flight f : databaseResponse) {
			FlightResponseDTO flightResponseDTO = new FlightResponseDTO();
			BeanUtils.copyProperties(f, flightResponseDTO);
			flightList.add(flightResponseDTO);
		}
		System.out.println("API HIT");
		return flightList;
	}

}
