package com.quinbay.airlinereservationbookingdetails.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserHistoryResponse {
    private String email;
    private String name;
    private String flightName;
    private Integer price;
    private String mobileNumber;
    private Date date;
}
