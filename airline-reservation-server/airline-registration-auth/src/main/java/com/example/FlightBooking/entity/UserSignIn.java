package com.example.FlightBooking.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserSignIn {
    @Id
    private String userName;
    private String password;
}
