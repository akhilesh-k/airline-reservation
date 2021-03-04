package com.example.FlightBooking.service;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;

public interface UserSignInService {
    boolean validate(UserSignInRequestDTO userSignInRequestDTO);
}
