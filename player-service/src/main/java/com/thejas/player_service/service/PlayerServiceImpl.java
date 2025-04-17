package com.thejas.player_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thejas.player_service.model.Player;
import com.thejas.player_service.repository.PlayerRepository;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
    }

    @Override
    public List<Player> getPlayersByTeam(String team) {
        return playerRepository.findByTeam(team);
    }
}