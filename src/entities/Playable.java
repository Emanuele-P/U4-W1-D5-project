package entities;

public abstract class Playable extends MediaContent {

    //attributes
    private int duration;

    //constructor
    public Playable(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    //methods
    public abstract void play();

    //encapsulation
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
