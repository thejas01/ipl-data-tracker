package com.thejas.scorecard_service.service;

import java.util.List;
import com.thejas.scorecard_service.model.InningType;
import com.thejas.scorecard_service.model.Scorecard;


public interface ScorecardService {
    Scorecard addScorecard(Scorecard scorecard);
    List<Scorecard> getScorecardsByMatch(Long matchId);
    List<Scorecard> getScorecardsByMatchAndInning(Long matchId, InningType inning);
}