package Main;

import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class DirectMessageHandler extends ListenerAdapter {

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        String[] msgA = msg.split(" ");

        switch (msgA[0].toLowerCase()) {

            case "register":
                registerCMD(msgA, event.getAuthor());
                break;


        }

    }


    private void registerCMD(String[] args, User user) {
        if (!(args.length >= 2)) {
            return;
        }
        switch (args[1].toLowerCase()) {
            case "solo":
                break;
            case "team":
                break;
        }
    }
}
