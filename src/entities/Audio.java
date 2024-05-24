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
        System.out.println("Playing audio: ");
        printDuration();
    }

    @Override
    public void increaseVolume() {
        if (volume < 10) {
            volume++;
            displayVolume();
        } else {
            System.out.println("Volume is at max level");
        }
    }

    @Override
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            displayVolume();
        } else {
            System.out.println("Volume is at min level");
        }
    }

    public String displayVolume() {
        String volumeLevel = "Volume: ";
        for (int i = 0; i < volume; i++) {
            volumeLevel += "!";
        }
        return volumeLevel;
    }

    //encapsulation
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
