package entities;

public class Picture extends Openable {

    //constructor
    public Picture(String title) {
        super(title);
    }

    //methods
    @Override
    public void show() {
        System.out.println("Viewing picture: " + getTitle());
    }
}
