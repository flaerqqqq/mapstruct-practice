package com.example.demo.rename.model.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LegacyOrderRow {
    private UUID orderUuid;
    private UUID custUuid;
    private Instant crtTs;
    private Instant updTs;
    private Instant payTs;
    private Instant shipTs;
    private BigDecimal totalAmt;
    private String currencyIso;
    private String promoCode;
    private String payMethodCode;
    private String shipMethodCode;
    private String addrLine;
    private String addrCity;
    private String addrZip;
    private String notesInternal;
}