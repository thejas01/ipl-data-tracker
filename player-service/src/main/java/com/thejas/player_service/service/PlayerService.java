package com.thejas.player_service.service;

import java.util.List;
import com.thejas.player_service.model.Player;

public interface PlayerService {
    Player addPlayer(Player player);
    Player getPlayerById(Long id);
    List<Player> getPlayersByTeam(String team);
}