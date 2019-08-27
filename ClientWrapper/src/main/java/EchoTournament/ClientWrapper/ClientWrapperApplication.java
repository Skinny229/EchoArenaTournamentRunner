package EchoTournament.ClientWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


@SpringBootApplication
public class ClientWrapperApplication {

    private static final Logger logger = LoggerFactory.getLogger(ClientWrapperApplication.class);

    public static void main(String[] args) {


        logger.info("Initiating Spring application");
        SpringApplication.run(ClientWrapperApplication.class, args);
    }

    @EventListener({ApplicationReadyEvent.class})
    public void OpenBrowserTabApplicationReady() {
        logger.info("Application has booted initiating browser interface...");

        String url = "http://locahost:8080";

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                logger.error(e.toString());
            }
        }else{
            Runtime runtime = Runtime.getRuntime();

            try{
             runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            }catch(IOException e){
                logger.error(e.toString());
            }
        }
    }
}
