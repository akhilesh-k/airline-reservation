package com.example.FlightBooking.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name = "loginn")
@Data
public class User {

    private String name;
    @Id
    private String userName;
    private String mobileNumber;
    private String email;
    private String password;

}
