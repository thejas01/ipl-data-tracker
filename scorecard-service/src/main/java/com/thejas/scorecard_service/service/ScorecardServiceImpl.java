package com.thejas.scorecard_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thejas.scorecard_service.dto.PlayerDTO;
import com.thejas.scorecard_service.dto.PlayerTeamDetailsResponse;
import com.thejas.scorecard_service.dto.TeamDTO;
import com.thejas.scorecard_service.feign.PlayerClient;
import com.thejas.scorecard_service.feign.TeamClient;
import com.thejas.scorecard_service.model.InningType;
import com.thejas.scorecard_service.model.Scorecard;
import com.thejas.scorecard_service.repository.ScorecardRepository;


@Service
public class ScorecardServiceImpl implements ScorecardService {

    @Autowired
    private ScorecardRepository scorecardRepository;

    @Override
    public Scorecard addScorecard(Scorecard scorecard) {
        return scorecardRepository.save(scorecard);
    }

    @Override
    public List<Scorecard> getScorecardsByMatch(Long matchId) {
        return scorecardRepository.findByMatchId(matchId);
    }

    @Override
    public List<Scorecard> getScorecardsByMatchAndInning(Long matchId, InningType inning) {
        return scorecardRepository.findByMatchIdAndInning(matchId, inning);
    }

    

}
