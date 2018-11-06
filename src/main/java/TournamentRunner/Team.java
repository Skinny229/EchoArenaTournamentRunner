package TournamentRunner;

import java.util.ArrayList;

public class Team {



   private ArrayList<Player> teamMembers = new ArrayList<Player>();

    public Team(Player[] players){
        for(Player i : players)
            teamMembers.add(i);


    }

    public ArrayList<Player> getTeamMembers() {
        return teamMembers;
    }

}
