package com.quinbay.airlinereservationbookingdetails.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name="history")
@Data
public class UserHistory {
    @Id
    @GenericGenerator(name = "user_id_seq", strategy = "increment")
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String name;
    private String flightName;
    private Integer price;
    private String mobileNumber;
    private Date date;

}
