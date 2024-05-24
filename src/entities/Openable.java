package entities;

public abstract class Openable extends MediaContent {

    //constructor
    public Openable(String title) {
        super(title);
    }

    //method
    public abstract void show();
}
