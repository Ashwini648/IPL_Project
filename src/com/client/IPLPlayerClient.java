package com.client;

import java.util.ArrayList;
import java.util.Map;
import com.controller.IPLController;
import com.tka.enitity.Player;
import com.dao.IPLPlayerDao;
import com.tka.service.IPLPlayerService;

public class IPLPlayerClient {

    public static void main(String[] args) {
        // Initialize the DAO
        IPLPlayerDao dao = new IPLPlayerDao();
        IPLPlayerService service = new IPLPlayerService(dao);
        
        
        IPLController controller = new IPLController(service);
        
        // Fetch and display all players
        ArrayList<Player> allPlayers = controller.getAllPlayers();
        System.out.println("All Players:");
        for (Player player : allPlayers) {
            System.out.println(player);
        }
        
        // Fetch and display players grouped by team
        Map<String, ArrayList<Player>> playersByTeam = controller.getAllPlayersByTeam();
        System.out.println("\nPlayers by Team:");
        for (Map.Entry<String, ArrayList<Player>> entry : playersByTeam.entrySet()) {
            System.out.println("Team: " + entry.getKey());
            for (Player player : entry.getValue()) {
                System.out.println(player);
            }
        }
    }
}
