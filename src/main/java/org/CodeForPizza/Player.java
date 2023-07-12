package org.CodeForPizza;


import jakarta.persistence.*;

@Entity

@Table(name="player_table")
public class Player {
    @Id
    //will auto increment id in database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerID;

    @Column(nullable = false, name="name")
    private String playerName;
    private String teamName;
    private int playerAge;

    public Player(String playerName, String teamName, int playerAge) {
        this.playerName = playerName;
        this.teamName = teamName;
        this.playerAge = playerAge;
    }

    public Player(int playerID, String playerName, String teamName, int playerAge) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.teamName = teamName;
        this.playerAge = playerAge;
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

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", playerage=" + playerAge +
                '}';
    }
}
