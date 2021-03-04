package com.example.FlightBooking.dto;

import lombok.Getter;

@Getter
public enum Validation {
    SUCCESS("Logged in successfully!"),
    USER_NOT_PRESENT("User is not present"),
    WRONG_USERNAME("Wrong UserName"),
    WRONG_PASSWORD("Wrong password");

    private String message;
    Validation(String message) {
        this.message = message;
    }
}