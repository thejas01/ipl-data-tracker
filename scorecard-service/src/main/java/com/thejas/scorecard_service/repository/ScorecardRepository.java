package com.thejas.scorecard_service.repository;

import java.util.List;
import com.thejas.scorecard_service.model.InningType;
import com.thejas.scorecard_service.model.Scorecard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScorecardRepository extends JpaRepository<Scorecard, Long> {
    List<Scorecard> findByMatchId(Long matchId);
    List<Scorecard> findByMatchIdAndInning(Long matchId, InningType inning);
}