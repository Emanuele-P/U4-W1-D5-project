package entities;


import interfaces.Volume;

public class Audio extends Playable implements Volume {

    //attributes
    private int volume;

    //constructor
    public Audio(String title, int duration) {
        super(title, duration);
    }

    //methods
    @Override
    public void play() {
        System.out.println("Playing audio: " + getTitle());
    }

    @Override
    public void increaseVolume(int volUp) {

    }

    @Override
    public void decreaseVolume(int volDown) {

    }

    //encapsulation
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
