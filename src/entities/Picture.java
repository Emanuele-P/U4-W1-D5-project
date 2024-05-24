package entities;

import interfaces.Brightness;

public class Picture extends Openable implements Brightness {

    //attributes
    private int brightness;

    //constructor
    public Picture(String title) {
        super(title);
        this.brightness = 5;
    }

    //methods
    @Override
    public void show() {
        System.out.println("Viewing picture: " + getTitle());
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
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
