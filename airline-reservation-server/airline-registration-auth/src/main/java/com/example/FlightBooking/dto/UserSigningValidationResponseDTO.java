package com.example.FlightBooking.dto;

import lombok.Data;
@Data
public class UserSigningValidationResponseDTO {
    private Validation code;
    private String message;
}