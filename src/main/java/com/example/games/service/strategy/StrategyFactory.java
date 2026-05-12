package com.example.games.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {

    private final WarriorBonusStrategy warriorBonusStrategy;
    private final MageBonusStrategy mageBonusStrategy;

    public StrategyFactory(WarriorBonusStrategy warriorBonusStrategy,
                           MageBonusStrategy mageBonusStrategy) {
        this.warriorBonusStrategy = warriorBonusStrategy;
        this.mageBonusStrategy = mageBonusStrategy;
    }

    public BonusStrategy getStrategy(String type) {

        if (type.equalsIgnoreCase("WARRIOR")) {
            return warriorBonusStrategy;
        }

        if (type.equalsIgnoreCase("MAGE")) {
            return mageBonusStrategy;
        }

        throw new IllegalArgumentException("Tipo de personagem inválido");
    }
}
