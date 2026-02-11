package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerPatchDto {
    private String firstName;     // rename to customer.first
    private String lastName;      // rename to customer.last
    private String email;         // rename to customer.contact.mail
    private String phone;         // rename to customer.contact.phone
}