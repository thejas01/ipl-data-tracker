package com.thejas.scorecard_service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thejas.scorecard_service.dto.PlayerDTO;
import com.thejas.scorecard_service.dto.PlayerTeamDetailsResponse;
import com.thejas.scorecard_service.dto.TeamDTO;
import com.thejas.scorecard_service.feign.PlayerClient;
import com.thejas.scorecard_service.feign.TeamClient;
import com.thejas.scorecard_service.model.InningType;
import com.thejas.scorecard_service.model.Scorecard;
import com.thejas.scorecard_service.service.ScorecardService;


@RestController
@RequestMapping("/scorecards")
public class ScorecardController {

    @Autowired
    private ScorecardService scorecardService;

    @PostMapping
    public Scorecard addScorecard(@RequestBody Scorecard scorecard) {
        return scorecardService.addScorecard(scorecard);
    }

    @GetMapping("/match/{matchId}")
    public List<Scorecard> getScorecardsByMatch(@PathVariable Long matchId) {
        return scorecardService.getScorecardsByMatch(matchId);
    }

    @GetMapping("/match/{matchId}/inning/{inning}")
    public List<Scorecard> getScorecardsByMatchAndInning(@PathVariable Long matchId,
                                                         @PathVariable InningType inning) {
        return scorecardService.getScorecardsByMatchAndInning(matchId, inning);
    }


    @Autowired
    private PlayerClient playerClient;

    @Autowired
    private TeamClient teamClient;

    @GetMapping("/player-team-details/{playerId}")
    public PlayerTeamDetailsResponse getPlayerAndTeamDetails(@PathVariable Long playerId) {

        // Fetch player details by playerId
        PlayerDTO player = playerClient.getPlayerById(playerId);

        // Fetch team details using the team name/id from player details
        // Assuming PlayerDTO has 'team' as teamName
        TeamDTO team = teamClient.getTeamByName(player.getTeam());

        // Return combined response
        return new PlayerTeamDetailsResponse(player, team);
    }
}