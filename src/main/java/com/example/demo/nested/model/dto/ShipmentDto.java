package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipmentDto {
    private String carrier;
    private String trackingId;
    private Instant shippedAt;
    private Instant deliveredAt;
}