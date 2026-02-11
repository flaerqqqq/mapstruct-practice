package com.example.demo.ignore.model.domain;

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
public class User {
    private UUID publicId;
    private String email;
    private String displayName;

    private String passwordHash;      // server-controlled
    private boolean enabled;          // server-controlled

    private Instant createdAt;        // server-controlled
    private Instant updatedAt;        // server-controlled

    private Set<String> roles;        // server-controlled
}