package com.example.FlightBooking.controller;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;
import com.example.FlightBooking.dto.UserSigningValidationResponseDTO;
import com.example.FlightBooking.service.UserSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class SignInController {
    @Autowired
    private UserSignInService userSignInService;
    @PostMapping
    public UserSigningValidationResponseDTO validate(@RequestBody UserSignInRequestDTO userSignInRequestDTO)
    {
        return userSignInService.validate(userSignInRequestDTO);
    }
}