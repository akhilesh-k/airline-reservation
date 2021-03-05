package com.example.airlineregistrationsearch.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class CompositeKey implements Serializable {
	private String fId;
	private java.sql.Date date;
}
