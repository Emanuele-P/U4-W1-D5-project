import entities.Audio;
import entities.MediaContent;
import entities.Picture;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Video video = new Video("Top10 Java Betrayals.mkv", 10);
        Audio audio1 = new Audio("Never Gonna Give You Up.mp3", 8);
        Audio audio2 = new Audio("Sandstorm.m4a", 5);
        Picture picture1 = new Picture("Array_methods_cheatsheet.jpg");
        Picture picture2 = new Picture("transparent.png");

        MediaContent[] mediaArray = {video, audio1, audio2, picture1, picture2};

        Scanner sc = new Scanner(System.in);
        boolean exit = false;


        System.out.println("Hello from your pc :)");
        System.out.println("Please select one of the following files:");
        for (int i = 0; i < mediaArray.length; i++) {
            System.out.println((i + 1) + ": " + mediaArray[i].getTitle());
        }
        System.out.println("Enter a number from 1 to 5 to select, press 0 to exit.");
        while (!exit) {
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 5) {
                MediaContent selectedMedia = mediaArray[choice - 1];
                System.out.println("You selected: " + selectedMedia.getTitle());

                if (selectedMedia instanceof Video) {
                    Video selectedVideo = (Video) selectedMedia;
                }
            } else if (choice == 0) {
                exit = true;
                System.out.println("Exiting program. Bye~~~");
            } else {
                System.out.println("Invalid number. Please select again :(");
            }
        }
        sc.close();

    }
}