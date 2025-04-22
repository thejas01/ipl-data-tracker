package com.thejas.scorecard_service.model;

import jakarta.persistence.*;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Scorecard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long matchId;      // Reference to Match
    private String teamName;
    private String playerName;

    @Enumerated(EnumType.STRING)
    private InningType inning;  // FIRST, SECOND

    private int runsScored;
    private int ballsFaced;
    private int wicketsTaken;
    private int oversBowled;
}