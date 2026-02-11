package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private UUID id;
    private Instant createdAt;

    private CustomerDto customer;
    private ShippingDto shipping;
    private BillingDto billing;

    private MetaDto meta;
}