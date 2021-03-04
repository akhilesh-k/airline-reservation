package com.example.airlineregistrationsearch.service.impl;

import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.entity.Flight;
import com.example.airlineregistrationsearch.repository.FlightRepository;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class FlightSearchServiceImpl implements FlightSearchService {
	@Autowired
	private FlightRepository flightRepository;


	public List<FlightResponseDTO> searchFlight(String source,String destination){
		List <FlightResponseDTO> flightList=new ArrayList<>();
		for(Flight f:flightRepository.findAll()){
			if(  f.getSource().equals(source) && f.getDestination().equals(destination)){
				FlightResponseDTO flightResponseDTO=new FlightResponseDTO();
				BeanUtils.copyProperties(f,flightResponseDTO);
				flightList.add(flightResponseDTO);
			}
		}
		return flightList;
	}

}
