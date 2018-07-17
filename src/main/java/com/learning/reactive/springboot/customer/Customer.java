package com.learning.reactive.springboot.customer;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.DateTimeException;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String name;
    private DateTime dob;
    private String city;
    private String aadhar;
}
