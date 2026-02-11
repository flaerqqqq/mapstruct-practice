package com.example.demo.nested.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MetaDto {
    private ActorDto created;
    private ActorDto updated;
    private Instant auditCreatedAt; // must come from audit.createdAt (NOT order.createdTs)
}