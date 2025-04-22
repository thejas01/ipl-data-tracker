package com.thejas.scorecard_service.feign;

import com.thejas.scorecard_service.dto.TeamDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "team-service")
public interface TeamClient {

    @GetMapping("/teams/name/{teamName}")
    TeamDTO getTeamByName(@PathVariable("teamName") String teamName);
}