package com.example.demo.nested.model.domain;

import com.example.demo.basic.model.domain.Customer;
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
public class OrderAggregate {
    private UUID id;
    private Instant createdTs;
    private Customer customer;
    private Shipping shipping;
    private Billing billing;
    private Audit audit;
}