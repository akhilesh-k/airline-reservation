package com.example.airlineregistrationsearch.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
public class AddFlight {

    @Id
    private Integer flightNo;
    private String airline;
    private String source;
    private String destination;
    private Date date;
    private String price;

}