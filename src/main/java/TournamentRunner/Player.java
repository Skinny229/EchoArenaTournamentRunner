package TournamentRunner;

public class Player {

    private String name,ID;
    private PlayerTeamStatus teamStyle;
    private boolean isRegistered;

    public Player(String IDl, String namel)
    {
        ID = IDl;
        name = namel;
        isRegistered = false;
        teamStyle = PlayerTeamStatus.NONE;
    }


     void setRegistered(boolean status)
    {
        isRegistered = status;
    }

     void setTeamStyle(PlayerTeamStatus toBe){
        teamStyle = toBe;
    }

    public boolean isRegistered(){
        return isRegistered;
    }

    public String getID(){
        return ID;
    }
}
