package com.example.demo.nested.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipmentPatchDto {
    private String carrier;       // -> shipping.meta.carrierCode
    private String trackingId;    // -> shipping.meta.trackingNo
}