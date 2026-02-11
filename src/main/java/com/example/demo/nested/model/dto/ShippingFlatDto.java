package com.example.demo.nested.model.dto;

import lombok.*;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingFlatDto {
    // address flattened
    private String country;
    private String city;
    private String postalCode;
    private String street;
    private String building;

    // shipment meta flattened
    private String carrier;
    private String trackingId;
    private Instant shippedAt;
    private Instant deliveredAt;
}