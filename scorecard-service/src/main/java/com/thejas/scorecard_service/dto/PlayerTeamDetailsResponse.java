package com.thejas.scorecard_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerTeamDetailsResponse {
    private PlayerDTO player;
    private TeamDTO team;
}