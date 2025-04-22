package com.thejas.scorecard_service.dto;

import lombok.Data;

@Data
public class PlayerDTO {
    private Long id;
    private String name;
    private String team;
    private String role;
}