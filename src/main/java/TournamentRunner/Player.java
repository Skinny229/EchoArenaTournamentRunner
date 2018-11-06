package TournamentRunner;

public class Player {

    private String name,ID;

    private boolean isRegistered;

    public Player(){
        isRegistered = false;
    }


    public void setRegister(boolean status)
    {
        isRegistered = status;
    }

    public boolean isRegistered(){
        return isRegistered;
    }

    public String getID(){
        return ID;
    }
}
