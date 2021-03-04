package com.example.FlightBooking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignInRequestDTO {
    private String userName;
    private String password;
}
