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
public class Audit {
    private String createdByLogin;
    private Instant createdAt;   // conflict candidate
    private String updatedByLogin;
    private Instant updatedAt;
}