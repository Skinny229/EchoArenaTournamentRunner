package TournamentRunner;

import java.util.HashMap;
import java.util.Map;

public class EchoTournament {
    Map registeredPlayers = new HashMap();


    void addPlayerSolo(Player ply){
        registeredPlayers.put(ply.getID(), ply);
    }


    //TODO AddPlayersFromDataBase(){}
}
