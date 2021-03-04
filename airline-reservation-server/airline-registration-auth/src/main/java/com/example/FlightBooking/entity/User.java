package com.example.FlightBooking.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name = "registration")
@Data
public class User {

    private String name;
    @Id
    private String userName;
    private String mobileNumber;
    @Column(unique = true)
    private String email;
    private String password;

}
