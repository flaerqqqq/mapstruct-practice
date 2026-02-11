package com.example.demo.nested.model.dto;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderMergeDto {
    private UUID id;

    // from customer
    private String first;
    private String last;
    private String mail;
    private String phone;

    // from shipping address (note naming differs)
    private String countryIso;
    private String cityName;
    private String zip;
    private String streetLine;
    private String houseNo;

    // from billing money
    private String currencyIso;
    private long totalCents;

    // conflict candidate name (same as OrderAggregate.createdTs, but you must map audit.createdAt here)
    private Instant createdAt;
}