package EchoTournament.ClientWrapper.Controllers;

import EchoTournament.ClientWrapper.Model.EchoSessionModel;
import EchoTournament.ClientWrapper.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class EchoVRGetter {


    private static final Logger logger = LoggerFactory.getLogger(EchoVRGetter.class);

    public static EchoSessionModel getLocalData(){

        RestTemplate restTemplate = new RestTemplate();
        EchoSessionModel sessionData;

        URI url = null;

      try{

          url = new URI(Settings.EA_HTTPSESSION_ADDRESS).resolve(Settings.EA_HTTPSESSION_ADDRESS);
        }catch(Exception e)
        {
           logger.error(e.toString());
        }


      try {
           sessionData = restTemplate.getForObject(url, EchoSessionModel.class);
      }catch (ResourceAccessException e)
      {
          logger.warn("Not able to collect data");
          return null;
      }

        return sessionData;

    }
}
