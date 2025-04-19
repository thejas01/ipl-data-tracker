package com.thejas.match_service.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "`match`")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamA;
    private String teamB;
    private LocalDate matchDate;
    private String venue;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;  // SCHEDULED, LIVE, COMPLETED

    @Version
    private Integer version; // Optimistic locking field
}