package org.CodeForPizza;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table
public class Player {
    @Id
    private int playerID;
    private String playerName;
    private String teamName;
    private int playerage;

    public Player(int playerID, String playerName, String teamName, int playerage) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.teamName = teamName;
        this.playerage = playerage;
    }

    public Player() {

    }


    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPlayerage() {
        return playerage;
    }

    public void setPlayerage(int playerage) {
        this.playerage = playerage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", playerage=" + playerage +
                '}';
    }
}
