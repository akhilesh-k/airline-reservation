package com.example.FlightBooking.service;

import com.example.FlightBooking.dto.UserRequestDTO;
import com.example.FlightBooking.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);
}
