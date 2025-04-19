package com.thejas.match_service.service;

import java.util.List;
import com.thejas.match_service.model.Match;

public interface MatchService {
    Match addMatch(Match match);
    Match getMatchById(Long id);
    List<Match> getAllMatches();
    Match updateMatchStatus(Long id, String status);
}
