package com.thejas.scorecard_service.feign;

import com.thejas.scorecard_service.dto.PlayerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "player-service")
public interface PlayerClient {

    @GetMapping("/players/{id}")
    PlayerDTO getPlayerById(@PathVariable("id") Long id);
}
