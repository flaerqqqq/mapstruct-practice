package com.example.demo.nested.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipmentMeta {
    private String carrierCode;
    private String trackingNo;
    private Instant shippedTs;
    private Instant deliveredTs;
}