package entities;


import interfaces.Volume;

public class Audio extends Playable implements Volume {

    //attributes
    private int volume;

    //constructor
    public Audio(String title, int duration) {
        super(title, duration);
        this.volume = 5;
    }

    //methods
    @Override
    public void play() {
        System.out.println("Playing audio: " + getTitle());
    }

    @Override
    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        } else {
            System.out.println("Volume is at max level");
        }
    }

    @Override
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume is at min level");
        }
    }

    //encapsulation
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
