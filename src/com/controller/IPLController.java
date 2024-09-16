package com.controller;

import java.util.ArrayList;
import java.util.Map;
import com.tka.enitity.Player;
import com.tka.service.IPLPlayerService;

public class IPLController {
    private IPLPlayerService service;

    public IPLController(IPLPlayerService service) {
        this.service = service;
    }

    public ArrayList<Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    public Map<String, ArrayList<Player>> getAllPlayersByTeam() {
        return service.getAllPlayersByTeam();
    }
}
