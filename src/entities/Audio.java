package entities;

public class Audio extends Playable {

    //constructor
    public Audio(String title, int duration) {
        super(title, duration);
    }

    //methods

    @Override
    public void play() {
        System.out.println("Playing audio: " + getTitle());
    }
}
