package EchoTournament.ClientWrapper.Model;

import javax.persistence.Entity;

@Entity
public class EchoDisc {


    private int[] position;

    private int[] velocity;

    private int bounce_count;

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int[] getVelocity() {
        return velocity;
    }

    public void setVelocity(int[] velocity) {
        this.velocity = velocity;
    }

    public int getBounce_count() {
        return bounce_count;
    }

    public void setBounce_count(int bounce_count) {
        this.bounce_count = bounce_count;
    }
}