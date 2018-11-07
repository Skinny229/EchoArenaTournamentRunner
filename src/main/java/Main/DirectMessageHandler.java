package Main;



import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class DirectMessageHandler extends ListenerAdapter {


    private void  dmRecieved(){

    }


    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        String msgD = event.getMessage().getContentDisplay();
        String msgR = event.getMessage().getContentRaw();
        String msgS = event.getMessage().getContentStripped();

        //CommandBreakdown.getCMDArray()

    }



    //For Submitting scores
    @Override
    public void onPrivateMessageUpdate(PrivateMessageUpdateEvent event) {
       event.getMessage().getChannel().sendMessage("At the moment, I'm not able to understand edited messages... yet").queue();
    }


}
