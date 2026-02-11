package com.example.demo.nested.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String countryIso;
    private String cityName;
    private String zip;
    private String streetLine;
    private String houseNo;
}