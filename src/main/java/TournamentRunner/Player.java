package TournamentRunner;

public class Player {

    private String name, ID, oculusName;
    private PlayerTeamStatus teamStyle;
    private boolean isRegistered, isCheckedIn;

    public Player(String IDl, String namel) {
        ID = IDl;
        name = namel;
        isRegistered = false;
        isCheckedIn = false;
        teamStyle = PlayerTeamStatus.NONE;
    }


    void setCheckedIn(boolean status) {
        isCheckedIn = status;
    }

    void setRegistered(boolean status) {
        isRegistered = status;
    }

    void setTeamStyle(PlayerTeamStatus toBe) {
        teamStyle = toBe;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    String getID() {
        return ID;
    }
}
