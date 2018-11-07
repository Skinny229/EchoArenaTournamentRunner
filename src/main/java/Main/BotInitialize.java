package Main;

import Database.ConnectionHandler;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import java.sql.Connection;


public class BotInitialize extends ListenerAdapter {


     static Connection databaseConnection;

    public static void main(String[] args) throws LoginException {

        JDA jda = new JDABuilder(Secrets.BOT_TOKEN).build();
        jda.addEventListener(new BotInitialize());
        jda.addEventListener(new DirectMessageHandler());

        databaseConnection = ConnectionHandler.getRemoteConnection();


    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        //event.getMember().getUser().
        if (event.isFromType(ChannelType.PRIVATE)) {
            System.out.printf("[PM] %s: %s\n", event.getAuthor().getName(),
                    event.getMessage().getContentDisplay());
        } else {
            System.out.printf("[%s][%s] %s: %s\n", event.getGuild().getName(),
                    event.getTextChannel().getName(), event.getMember().getEffectiveName(),
                    event.getMessage().getContentDisplay());
        }
    }
}

