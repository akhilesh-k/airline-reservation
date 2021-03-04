package com.example.FlightBooking.controller;

import com.example.FlightBooking.dto.UserRequestDTO;
import com.example.FlightBooking.dto.UserResponseDTO;
import com.example.FlightBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO)
    {
        return userService.createUser(userRequestDTO);
    }
}
