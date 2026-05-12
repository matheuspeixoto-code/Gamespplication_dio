package com.example.games.config;

public class SystemConfig {

    private static SystemConfig instance;

    private String serverVersion;

    private int totalPlayers;

    private SystemConfig() {
        this.serverVersion = "1.0.0";
        this.totalPlayers = 0;
    }

    public static synchronized SystemConfig getInstance() {

        if (instance == null) {
            instance = new SystemConfig();
        }

        return instance;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void incrementPlayers() {
        totalPlayers++;
    }
}
