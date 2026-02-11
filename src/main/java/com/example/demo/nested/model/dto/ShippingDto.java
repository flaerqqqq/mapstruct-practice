package com.example.demo.nested.model.dto;

import com.example.demo.basic.model.dto.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingDto {
    private AddressDto address;
    private ShipmentDto shipment;
}