package com.thejas.match_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thejas.match_service.model.Match;
import com.thejas.match_service.model.MatchStatus;
import com.thejas.match_service.repository.MatchRepository;


@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Match addMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match getMatchById(Long id) {
        return matchRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
    }

    @Override
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public Match updateMatchStatus(Long id, String status) {
        Match match = matchRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
        match.setStatus(MatchStatus.valueOf(status));
        return matchRepository.save(match);
    }
}
