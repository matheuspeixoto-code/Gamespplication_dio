package com.example.games.controller;

import com.example.games.model.Player;
import com.example.games.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return service.createPlayer(player);
    }

    @GetMapping
    public List<Player> listPlayers() {
        return service.listPlayers();
    }

    @GetMapping("/{id}/bonus")
    public int calculateBonus(@PathVariable Long id) {
        return service.calculateBonus(id);
    }

    @GetMapping("/server/version")
    public String getVersion() {
        return service.getServerVersion();
    }

    @GetMapping("/server/players")
    public int getTotalPlayers() {
        return service.getTotalPlayers();
    }
}
