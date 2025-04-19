package com.thejas.match_service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.thejas.match_service.model.Match;
import com.thejas.match_service.service.MatchService;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping
    public Match addMatch(@RequestBody Match match) {
        return matchService.addMatch(match);
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @PutMapping("/{id}/status")
    public Match updateMatchStatus(@PathVariable Long id, @RequestParam String status) {
        return matchService.updateMatchStatus(id, status);
    }
}
