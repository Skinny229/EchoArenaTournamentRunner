package TournamentRunner;

public class Player {

    private String name,ID;
    private PlayerTeamStatus teamStatus;
    private boolean isRegistered;

    public Player(String IDl, String namel)
    {
        ID = IDl;
        name = namel;
        isRegistered = false;
        teamStatus = PlayerTeamStatus.NONE;
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
