package entities;

public abstract class MediaContent {

    //attributes
    private String title;

    //constructor
    public MediaContent(String title) {
        this.title = title;
    }

    //encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + title + '\'' +
                '}';
    }
}
