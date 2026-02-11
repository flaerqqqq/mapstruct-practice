package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingPatchDto {
    private String country;       // -> shipping.address.countryIso
    private String city;          // -> shipping.address.cityName
    private String postalCode;    // -> shipping.address.zip
    private String street;        // -> shipping.address.streetLine
    private String building;      // -> shipping.address.houseNo
}