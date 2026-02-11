package com.example.demo.rename.model.dto;

import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Instant registeredAt;
    private Instant lastLoginAt;
    private String status;
    private boolean isMarketingConsent;
    private String country;
    private String city;
    private String postalCode;
    private String street;
    private String building;
}