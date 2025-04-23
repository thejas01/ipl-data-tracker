package com.thejas.team_service.service;

import java.util.List;
import com.thejas.team_service.model.Team;


public interface TeamService {
    Team addTeam(Team team);
    Team getTeamById(Long id);
    List<Team> getAllTeams();
}