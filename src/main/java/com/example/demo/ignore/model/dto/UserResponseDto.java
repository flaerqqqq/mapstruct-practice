package com.example.demo.ignore.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private UUID publicId;
    private String email;
    private String displayName;
    private boolean enabled;
    private Instant createdAt;
    private Set<String> roles;
}