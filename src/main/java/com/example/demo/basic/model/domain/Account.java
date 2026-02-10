package com.example.demo.basic.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    private Instant createdAt;
    private boolean active;
    private Subscription subscription;
}