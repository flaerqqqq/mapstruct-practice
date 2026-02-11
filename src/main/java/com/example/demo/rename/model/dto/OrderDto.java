package com.example.demo.rename.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private UUID id;
    private UUID customerId;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant paidAt;
    private Instant shippedAt;
    private BigDecimal total;
    private String currency;
    private String coupon;
    private String paymentMethod;
    private String shippingMethod;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryPostalCode;
    private String internalNote;
}