package com.example.airlineregistrationsearch.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class CompositeKey implements Serializable {

    private String f_Id;
    private java.sql.Date date;
}
