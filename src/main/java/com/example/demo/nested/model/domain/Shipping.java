package com.example.demo.nested.model.domain;

import com.example.demo.basic.model.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipping {
    private Address address;
    private ShipmentMeta meta;
}