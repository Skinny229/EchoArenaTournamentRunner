package EchoTournament.ClientWrapper;

public class EchovrHandler {



    Process echoInstance;

    boolean isInstanceCreated(){
        return echoInstance != null;
    }

    boolean isInstanceActive()
    {
        if(echoInstance != null)
            return echoInstance.isAlive();
        else
            return false;
    }




}
