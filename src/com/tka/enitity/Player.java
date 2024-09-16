package com.tka.enitity;

public class Player {
    private int id;
    private String name;
    private int score;
    private int rank;
    private String team;

    public Player(int id, String name, int score, int rank, String team) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.rank = rank;
        this.team = team;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    @Override
    public String toString() {
        return "Player{id=" + id + ", name='" + name + "', score=" + score + ", rank=" + rank + ", team='" + team + "'}";
    }
}
