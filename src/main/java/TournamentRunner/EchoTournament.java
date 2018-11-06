package TournamentRunner;

import net.dv8tion.jda.core.entities.User;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.HashMap;
import java.util.Map;

public class EchoTournament {
    Map registeredPlayers = new HashMap();

    static Map knownPlayers = new HashMap();


    void addPlayerSolo(Player ply) {
        registeredPlayers.put(ply.getID(), ply);
    }


    /*
     *   Methos will create a Player object for the discord user if it hasn't already and register it;
     *
     * */
    void addPlayerToTournament(MessageReceivedEvent event, PlayerTeamStatus toBe) {
        User user = event.getAuthor();
        Player ply;
        if (knownPlayers.containsKey(user.getId())) {
            ply = (Player) knownPlayers.get(user.getId());
            /*
             * If the user exists in the known directory, add the individual to the tournament
             * */
        } else {
            ply = new Player(user.getId(), user.getName());
            registeredPlayers.put(user.getId(), ply);
        }




        ply.setRegistered(true);

    }


    //TODO InitHashMapFromDataBase(){}
}
