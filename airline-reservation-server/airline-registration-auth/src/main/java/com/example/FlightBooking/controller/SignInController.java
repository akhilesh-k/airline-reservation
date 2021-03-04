package com.example.FlightBooking.controller;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;
import com.example.FlightBooking.service.UserSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class SignInController {
    @Autowired
    private UserSignInService userSignInService;
    @PostMapping
    public boolean validate(@RequestBody UserSignInRequestDTO userSignInRequestDTO)
    {
        return userSignInService.validate(userSignInRequestDTO);
    }

}
