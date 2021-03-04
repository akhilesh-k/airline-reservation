package com.example.FlightBooking.service.impl;

import com.example.FlightBooking.dto.FlightRequestDTO;
import com.example.FlightBooking.dto.FlightResponseDTO;
import com.example.FlightBooking.entity.Flight;
import com.example.FlightBooking.repository.FlightRepository;
import com.example.FlightBooking.service.FlightService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepository flightRepository;
    public List<FlightResponseDTO> searchFlight(String source, String destination)
    {
        List<FlightResponseDTO> flightList=new ArrayList<>();

        for(Flight f:flightRepository.findAll())
        {
            if(f.getSource().equals(source)&&f.getDestination().equals(destination))
            {
                FlightResponseDTO flightResponseDTO=new FlightResponseDTO();
                BeanUtils.copyProperties(f,flightResponseDTO);
                flightList.add(flightResponseDTO);
            }
        }
        return flightList;
    }
}
