package com.example.demo.rename.model.domain;

import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LegacyCustomerRecord {
    private UUID uuid;
    private String fname;
    private String lname;
    private String mail;
    private String phoneNum;
    private LocalDate birth;
    private Instant regTs;
    private Instant lastLoginTs;
    private String statusCode;
    private boolean marketingOk;
    private String countryIso;
    private String cityName;
    private String zip;
    private String streetLine;
    private String houseNo;
}