import entities.Audio;
import entities.MediaContent;
import entities.Picture;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Video video = new Video("Top10 Java Betrayals.mkv", 10);
        Audio audio1 = new Audio("Never Gonna Give You Up.mp3", 7);
        Audio audio2 = new Audio("Sandstorm.m4a", 3);
        Picture picture1 = new Picture("Array_methods_cheatsheet.jpg");
        Picture picture2 = new Picture("transparent.png");

        MediaContent[] mediaArray = {video, audio1, audio2, picture1, picture2};

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Hello from your pc :)");
            System.out.println("Please select one of the following files:");
            for (int i = 0; i < mediaArray.length; i++) {
                System.out.println((i + 1) + ": " + mediaArray[i].getTitle());
            }
            System.out.println("Enter a number from 1 to 5 to select, press 0 to exit.");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 5) {
                MediaContent selectedMedia = mediaArray[choice - 1];

                if (selectedMedia instanceof Video selectedVideo) {
                    boolean inVideo = true;

                    while (inVideo) {
                        selectedVideo.play();

                        System.out.println("To increase the volume press +, to decrease it press -");
                        System.out.println("To increase the brightness press u, to decrease it press d");
                        System.out.println("Press q to return to selection");

                        boolean exitSettings = false;

                        while (!exitSettings) {
                            String input = sc.nextLine();
                            if (input.equals("+")) {
                                selectedVideo.increaseVolume();
                                selectedVideo.play();
                            } else if (input.equals("-")) {
                                selectedVideo.decreaseVolume();
                                selectedVideo.play();
                            } else if (input.equals("u")) {
                                selectedVideo.increaseBrightness();
                            } else if (input.equals("d")) {
                                selectedVideo.decreaseBrightness();
                            } else if (input.equals("q")) {
                                exitSettings = true;
                                System.out.println("Exiting settings...");
                            } else {
                                System.out.println("Invalid input. Try again :(");
                            }
                        }
                        selectedVideo.play();
                        System.out.println("Press q to go to main selection");
                        String input = sc.nextLine();
                        if (input.equals("q")) {
                            inVideo = false;
                        }
                    }


                } else if (selectedMedia instanceof Audio selectedAudio) {
                    selectedAudio.play();
                    System.out.println("To increase the volume press +, to decrease it press -, to quit press q");

                    boolean exitVolume = false;

                    while (!exitVolume) {
                        String input = sc.nextLine();
                        if (input.equals("+")) {
                            selectedAudio.increaseVolume();
                            selectedAudio.play();
                        } else if (input.equals("-")) {
                            selectedAudio.decreaseVolume();
                            selectedAudio.play();
                        } else if (input.equals("q")) {
                            exitVolume = true;
                            System.out.println("Exiting volume selection...");
                        } else {
                            System.out.println("Invalid input. Try again :(");
                        }
                    }

                } else if (selectedMedia instanceof Picture selectedPicture) {
                    selectedPicture.show();

                    System.out.println("To increase the brightness press u, to decrease it press d, to quit press q");
                    boolean exitBrightness = false;

                    while (!exitBrightness) {
                        String input = sc.nextLine();
                        if (input.equals("u")) {
                            selectedPicture.show();
                            selectedPicture.increaseBrightness();
                        } else if (input.equals("d")) {
                            selectedPicture.decreaseBrightness();
                        } else if (input.equals("q")) {
                            exitBrightness = true;
                            System.out.println("Exiting brightness selection...");
                        } else {
                            System.out.println("Invalid input. Try again :(");
                        }
                    }
                }


            } else if (choice == 0) {
                exit = true;
                System.out.println("Exiting program... Bye~~~");
            } else {
                System.out.println("Invalid number. Please select again :(");
                sc.next();
            }
        }

        sc.close();
    }
}