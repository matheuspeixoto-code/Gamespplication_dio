package com.example.games.service.strategy;

import com.example.games.model.Player;
import org.springframework.stereotype.Component;

@Component
public class MageBonusStrategy implements BonusStrategy {

    @Override
    public int calculateBonus(Player player) {
        return player.getLevel() * 150;
    }
}
