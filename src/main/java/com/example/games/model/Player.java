package com.example.games.model;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String characterType;

    private Integer level;

    private Integer xp;

    public Player() {
    }

    public Player(String name, String characterType, Integer level, Integer xp) {
        this.name = name;
        this.characterType = characterType;
        this.level = level;
        this.xp = xp;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCharacterType() {
        return characterType;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getXp() {
        return xp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }
}
