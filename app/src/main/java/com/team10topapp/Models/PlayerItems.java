package com.team10topapp.Models;

public class PlayerItems {
    int playerid;
    int teams_id;
    String player_no;
    String playername;
    String designation;
    public PlayerItems(int playerid, int teams_id, String player_no, String playername, String designation) {
        this.playerid = playerid;
        this.teams_id = teams_id;
        this.player_no = player_no;
        this.playername = playername;
        this.designation = designation;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public int getTeams_id() {
        return teams_id;
    }

    public void setTeams_id(int teams_id) {
        this.teams_id = teams_id;
    }

    public String getPlayer_no() {
        return player_no;
    }

    public void setPlayer_no(String player_no) {
        this.player_no = player_no;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
