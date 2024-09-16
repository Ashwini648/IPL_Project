package com.tka.service;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import com.dao.IPLPlayerDao;
import com.tka.enitity.Player;

public class IPLPlayerService {
    private IPLPlayerDao dao;

    public IPLPlayerService(IPLPlayerDao dao) {
        this.dao = dao;
    }

    public ArrayList<Player> getAllPlayers() {
        return dao.getAllPlayers1();
    }

    public Map<String, ArrayList<Player>> getAllPlayersByTeam() {
        ArrayList<Player> db = dao.getAllPlayers1();
        Map<String, ArrayList<Player>> teamPlayersMap = new HashMap<>();

        for (Player player : db) {
            String team = player.getTeam();
            ArrayList<Player> playersList = teamPlayersMap.get(team);
            if (playersList == null) {
                playersList = new ArrayList<>();
                teamPlayersMap.put(team, playersList);
            }
            playersList.add(player);
        }

        return teamPlayersMap;
    }
}
