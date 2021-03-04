package com.example.airlineregistrationsearch.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
@Data
@Embeddable
public class CompositeKey implements Serializable {
    private String fId;
    private String date;
}
