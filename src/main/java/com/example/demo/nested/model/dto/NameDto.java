package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NameDto {
    private String given;
    private String family;
    private String full; // ignore in mapping
}