package com.example.demo.basic.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;
    private Address address;
    private Account account;
}