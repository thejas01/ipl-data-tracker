package com.thejas.player_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;  // Batsman, Bowler, All-Rounder, Wicketkeeper
    private String team;
    private int totalRuns;
    private int totalWickets;
    private int matchesPlayed;
}