package com.example.FlightBooking.service;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;
import com.example.FlightBooking.dto.UserSigningValidationResponseDTO;

public interface UserSignInService{
    UserSigningValidationResponseDTO validate(UserSignInRequestDTO userSignInRequestDTO);
}
