package entities;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends Playable implements Volume, Brightness {

    //attributes
    private int volume;
    private int brightness;

    //constructor
    public Video(String title, int duration) {
        super(title, duration);
    }

    //methods

    @Override
    public void play() {
        System.out.println("Playing video: " + getTitle());
    }

    @Override
    public void increaseVolume(int volUp) {

    }

    @Override
    public void decreaseVolume(int volDown) {

    }


    @Override
    public void increaseBrithness(int valueUp) {

    }

    @Override
    public void decreaseBrithness(int valueDown) {

    }

    //encapsulation
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
