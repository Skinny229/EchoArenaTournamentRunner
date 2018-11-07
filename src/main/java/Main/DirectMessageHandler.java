package Main;

import TournamentRunner.EchoTournament;
import TournamentRunner.PlayerTeamStatus;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class DirectMessageHandler extends ListenerAdapter {

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        String[] msgA = msg.split(" ");

        if(msgA.length < 1)
            return;


        switch (msgA[0].toLowerCase()) {

            case "register":
                registerCMD(msgA, event);
                break;


        }

    }

    EchoTournament EAVRT = new EchoTournament();

    private void registerCMD(@NotNull String[] args, PrivateMessageReceivedEvent event) {
        if (!(args.length >= 2)) {
            return;
        }
        switch (args[1].toLowerCase()) {
            case "solo":
                EAVRT.addPlayerToTournament(event, PlayerTeamStatus.SOLO_NO_TEAM);
                break;
            case "team":
                EAVRT.addPlayerToTournament(event, PlayerTeamStatus.TEAM);
                break;
        }
    }
}
