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
        this.brightness = 5;
        this.volume = 5;
    }

    //methods

    @Override
    public void play() {
        System.out.println("Playing video: " + getTitle());
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


    @Override
    public void increaseBrithness() {
        if (brightness < 10) {
            brightness++;
        } else {
            System.out.println("Brightness is at max level");
        }
    }

    @Override
    public void decreaseBrithness() {
        if (brightness > 0) {
            brightness--;
        } else {
            System.out.println("Brightness is at min level");
        }
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
