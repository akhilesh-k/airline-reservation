package com.example.FlightBooking.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserRequestDTO
{
    private String userName;
    private String name;
    private String mobileNumber;
    private String email;
    private String password;
}
