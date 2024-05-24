package entities;

import interfaces.Brightness;

public class Picture extends Openable implements Brightness {

    //attributes
    private int brightness;

    //constructor
    public Picture(String title) {
        super(title);
    }

    //methods
    @Override
    public void show() {
        System.out.println("Viewing picture: " + getTitle());
    }

    @Override
    public void increaseBrithness(int valueUp) {

    }

    @Override
    public void decreaseBrithness(int valueDown) {

    }

    //encapsulation
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
