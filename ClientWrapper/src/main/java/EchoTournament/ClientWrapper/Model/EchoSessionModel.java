package EchoTournament.ClientWrapper.Model;

import javax.persistence.Entity;

@Entity
public class EchoSessionModel {

    private EchoDisc disc;
    private String sessionid;
    private String game_clock_display;
    private double game_clock;
    private int orange_points;
    private boolean private_match;
    private EchoTeam[] teams;
    private String map_name;
    private int[] possession;
    private boolean tournament_match;
    private int blue_points;


    public EchoDisc getDisc() {
        return disc;
    }

    public void setDisc(EchoDisc disc) {
        this.disc = disc;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public int getOrange_points() {
        return orange_points;
    }

    public void setOrange_points(int orange_points) {
        this.orange_points = orange_points;
    }

    public boolean isPrivate_match() {
        return private_match;
    }

    public void setPrivate_match(boolean private_match) {
        this.private_match = private_match;
    }

    public EchoTeam[] getTeams() {
        return teams;
    }

    public void setTeams(EchoTeam[] teams) {
        this.teams = teams;
    }

    public String getMap_name() {
        return map_name;
    }

    public void setMap_name(String map_name) {
        this.map_name = map_name;
    }

    public int[] getPossession() {
        return possession;
    }

    public void setPossession(int[] possession) {
        this.possession = possession;
    }

    public boolean isTournament_match() {
        return tournament_match;
    }

    public void setTournament_match(boolean tournament_match) {
        this.tournament_match = tournament_match;
    }

    public int getBlue_points() {
        return blue_points;
    }

    public void setBlue_points(int blue_points) {
        this.blue_points = blue_points;
    }

    public String getGame_clock_display() {
        return game_clock_display;
    }

    public void setGame_clock_display(String game_clock_display) {
        this.game_clock_display = game_clock_display;
    }

    public double getGame_clock() {
        return game_clock;
    }

    public void setGame_clock(double game_clock) {
        this.game_clock = game_clock;
    }
}
