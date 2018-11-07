package Main;

import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GuildMessageHandler extends ListenerAdapter {


    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        System.out.println(event.getMember().getUser().getName());
        User user = event.getAuthor();
        if(event.getMessage().getContentDisplay() == "test")
            event.getMessage().getChannel().sendMessage("Opening Private channel....").queue();

            event.getAuthor().openPrivateChannel().queue( channel -> {
                channel.sendMessage("Hello");
            });

    }
}
