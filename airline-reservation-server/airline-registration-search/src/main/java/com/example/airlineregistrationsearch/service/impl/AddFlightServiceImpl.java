package com.example.airlineregistrationsearch.service.impl;




import com.example.airlineregistrationsearch.dto.AddFlightRequestDTO;
import com.example.airlineregistrationsearch.dto.AddFlightResponseDTO;
import com.example.airlineregistrationsearch.entity.AddFlight;
import com.example.airlineregistrationsearch.repository.AddFlightRepository;
import com.example.airlineregistrationsearch.service.AddFlightService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddFlightServiceImpl implements AddFlightService {

    @Autowired
    private AddFlightRepository addFlightRepository;

    public AddFlightResponseDTO createAddFlight(AddFlightRequestDTO addFlightRequestDTO) {
        AddFlight addFlight = new AddFlight();

        //copy fields from dto to addFlight
        BeanUtils.copyProperties(addFlightRequestDTO, addFlight);

        //save addFlight to db
        AddFlight savedAddFlight = addFlightRepository.save(addFlight);

        // copy from addflight to response dto
        AddFlightResponseDTO responseDto = new AddFlightResponseDTO();
        BeanUtils.copyProperties(savedAddFlight, responseDto);

        return responseDto;
    }
}
