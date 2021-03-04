package com.example.FlightBooking.controller;

import com.example.FlightBooking.dto.UserRequestDTO;
import com.example.FlightBooking.dto.UserResponseDTO;
import com.example.FlightBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO)
    {
        return userService.createUser(userRequestDTO);
    }
}
