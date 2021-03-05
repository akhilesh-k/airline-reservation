package com.example.airlineregistrationsearch.dto;



import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddFlightRequestDTO {

    private Integer flightNo;
    private String airline;
    private String source;
    private String destination;
    private Date date;
    private String price;
}
