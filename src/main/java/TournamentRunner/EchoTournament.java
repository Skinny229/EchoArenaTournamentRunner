package TournamentRunner;

import net.dv8tion.jda.core.entities.User;

import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EchoTournament {

    private Map<String, Player> registeredPlayers = new HashMap();
    private ArrayList<Player> soloPlayers = new ArrayList<>();
    private static HashMap<String,Player> knownPlayers = new HashMap();



    /*
     *   Methods will create a Player object for the discord user if it hasn't already and register it;
     *
     * */
    public void addPlayerToTournament(PrivateMessageReceivedEvent event, PlayerTeamStatus toBe) {
        User user = event.getAuthor();
        Player ply;

        /*
        * Retrieves Player from the HashMap Directory otherwise create the player object and add it the directory
        * */
        if (knownPlayers.containsKey(user.getId())) {
            ply = knownPlayers.get(user.getId());
        } else {
            ply = new Player(user.getId(), user.getName());
            knownPlayers.put(user.getId(), ply);
        }


        //Add the player to the ArrayList for teaming up
        if (toBe == PlayerTeamStatus.SOLO_NO_TEAM)
            soloPlayers.add(ply);

        //Finish Registration
        ply.setTeamStyle(toBe);
        ply.setRegistered(true);
        registeredPlayers.put(ply.getID(), ply);
    }






    //TODO: Start Tournament
    void startTournament(){
        groupSoloPlayers();
    }

    //TODO: Implement this
   private void groupSoloPlayers(){

    }



    //TODO: Implement this
//    void endTournament() {
//        resetStatus();
//    }
//
//    void resetStatus() {
//
//    }


    //TODO InitHashMapFromDataBase(){}
}
