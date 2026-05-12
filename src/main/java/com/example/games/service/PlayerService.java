package com.example.games.service;

import com.example.games.config.SystemConfig;
import com.example.games.model.Player;
import com.example.games.repository.PlayerRepository;
import com.example.games.service.strategy.BonusStrategy;
import com.example.games.service.strategy.StrategyFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository repository;

    private final StrategyFactory strategyFactory;

    public PlayerService(PlayerRepository repository,
                         StrategyFactory strategyFactory) {
        this.repository = repository;
        this.strategyFactory = strategyFactory;
    }

    public Player createPlayer(Player player) {

        SystemConfig config = SystemConfig.getInstance();
        config.incrementPlayers();

        return repository.save(player);
    }

    public List<Player> listPlayers() {
        return repository.findAll();
    }

    public int calculateBonus(Long playerId) {

        Player player = repository.findById(playerId)
                .orElseThrow(() -> new RuntimeException("Player não encontrado"));

        BonusStrategy strategy = strategyFactory
                .getStrategy(player.getCharacterType());

        return strategy.calculateBonus(player);
    }

    public String getServerVersion() {
        return SystemConfig.getInstance().getServerVersion();
    }

    public int getTotalPlayers() {
        return SystemConfig.getInstance().getTotalPlayers();
    }
}
