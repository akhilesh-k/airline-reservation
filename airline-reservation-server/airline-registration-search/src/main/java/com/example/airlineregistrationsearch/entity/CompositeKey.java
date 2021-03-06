package com.example.airlineregistrationsearch.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;

@Embeddable
public class CompositeKey implements Serializable {
    private String fId;
    private Date date;
}
