package entities;

public class Video extends Playable {

    //constructor
    public Video(String title, int duration) {
        super(title, duration);
    }

    //methods

    @Override
    public void play() {
        System.out.println("Playing video: " + getTitle());
    }
}
