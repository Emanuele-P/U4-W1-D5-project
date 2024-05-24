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

    public void increaseBrightness() {
        if (brightness < 10) {
            brightness++;
            displayBrightness();
        } else {
            System.out.println("Brightness is at max level");
        }
    }

    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
            displayBrightness();
        } else {
            System.out.println("Brightness is at min level");
        }
    }

    private void displayBrightness() {
        String brightnessLevel = "Brightness: ";
        for (int i = 0; i < brightness; i++) {
            brightnessLevel += "*";
        }
        System.out.println(brightnessLevel);
    }

    //encapsulation
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
