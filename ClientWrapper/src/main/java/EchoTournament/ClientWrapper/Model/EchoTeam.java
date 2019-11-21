package EchoTournament.ClientWrapper.Model;

import javax.persistence.Entity;

@Entity
public class EchoTeam {

    private EchoPlayer[] players;
    private String team;
    private EchoGameGeneratedStats stats;
    private boolean possession;

    public EchoPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(EchoPlayer[] players) {
        this.players = players;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public boolean isPossession() {
        return possession;
    }

    public void setPossession(boolean possession) {
        this.possession = possession;
    }

    public EchoGameGeneratedStats getStats() {
        return stats;
    }

    public void setStats(EchoGameGeneratedStats stats) {
        this.stats = stats;
    }
}
