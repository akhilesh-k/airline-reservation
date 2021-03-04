package com.example.airlineregistrationsearch.service.impl;

import com.example.airlineregistrationsearch.dto.FlightRequestDTO;
import com.example.airlineregistrationsearch.dto.FlightResponseDTO;
import com.example.airlineregistrationsearch.entity.CompositeKey;
import com.example.airlineregistrationsearch.entity.Flight;
import com.example.airlineregistrationsearch.repository.FlightRepository;
import com.example.airlineregistrationsearch.service.FlightSearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class FlightSearchServiceImpl implements FlightSearchService {
	@Autowired
	private FlightRepository flightRepository;


	public List<FlightResponseDTO> searchFlight(String source,String destination,String date,String fId){
		List <FlightResponseDTO> flightList=new ArrayList<>();
		for(Flight f:flightRepository.findAll()){
			if(f.getSource().equals(source) && f.getDestination().equals(destination)&&f.getSeats()>0){
				FlightResponseDTO flightResponseDTO=new FlightResponseDTO();
				BeanUtils.copyProperties(f,flightResponseDTO);
				flightList.add(flightResponseDTO);
			}
		}
		return flightList;
	}
	public Integer updateFlightBooking(FlightRequestDTO flightRequestDTO)
	{
		List<FlightResponseDTO> flightList=new ArrayList<>();
		Integer s=0;
		for (Flight f:flightRepository.findAll())
		{
			CompositeKey FlightId=new CompositeKey();
			FlightId.setDate(flightRequestDTO.getDate());
			FlightId.setFId(flightRequestDTO.getF_id());
			if(f.getFlightId().getDate().equals(flightRequestDTO.getDate()) && f.getFlightId().getFId().equals(flightRequestDTO.getF_id())){
				Integer seats =f.getSeats();
				seats--;
				f.setSeats(seats);
				s=seats;
				flightRepository.save(f);
			}
			break;
		}
		return s;
	}

}
