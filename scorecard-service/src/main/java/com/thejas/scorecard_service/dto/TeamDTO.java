package com.thejas.scorecard_service.dto;

import lombok.Data;

@Data
public class TeamDTO {
    private Long id;
    private String teamName;
    private String city;
    private String homeStadium;
}