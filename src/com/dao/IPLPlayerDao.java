package com.dao;
import java.util.ArrayList;
import com.tka.enitity.Player;

public class IPLPlayerDao {
	public ArrayList<Player> getAllPlayers1() {
		ArrayList<Player> playerdb = new ArrayList<>();
		playerdb.add(new Player(7, "MSD", 500, 6, "CSK"));
		playerdb.add(new Player(45, "Rohit Sharma", 600, 1, "MI"));
		playerdb.add(new Player(18, "Virat Kohli", 700, 2, "RCB"));
		playerdb.add(new Player(10, "Sachin Tendulkar", 800, 3, "MI"));
		playerdb.add(new Player(77, "Shubman Gill", 300, 1, "GT"));
		playerdb.add(new Player(93, "Jasprit Bumrah", 300, 700, "CSK"));
		return playerdb;
	}
}


