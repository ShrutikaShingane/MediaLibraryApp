package medialibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaLibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Playable> mediaList = new ArrayList<>();

        while (true) {

            System.out.println("\n===== MEDIA LIBRARY =====");
            System.out.println("1. Add Song");
            System.out.println("2. Add Video");
            System.out.println("3. List Media");
            System.out.println("4. Play Media");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine().trim();

            switch (choice) {

                case "1":
                    System.out.print("Enter song title: ");
                    String songTitle = sc.nextLine();

                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();

                    mediaList.add(new Song(songTitle, artist));
                    System.out.println("Song added successfully!");
                    break;

                case "2":
                    System.out.print("Enter video title: ");
                    String videoTitle = sc.nextLine();

                    System.out.print("Enter creator name: ");
                    String creator = sc.nextLine();

                    mediaList.add(new Video(videoTitle, creator));
                    System.out.println("Video added successfully!");
                    break;

                case "3":
                    if (mediaList.isEmpty()) {
                        System.out.println("No media available.");
                    } else {
                        System.out.println("\n--- Media List ---");

                        for (int i = 0; i < mediaList.size(); i++) {
                            System.out.println((i + 1) + ". "
                                    + mediaList.get(i));
                        }
                    }
                    break;

                case "4":
                    if (mediaList.isEmpty()) {
                        System.out.println("No media available to play.");
                        break;
                    }

                    System.out.println("\n--- Select Media ---");

                    for (int i = 0; i < mediaList.size(); i++) {
                        System.out.println((i + 1) + ". "
                                + mediaList.get(i));
                    }

                    System.out.print("Enter media number: ");
                    String input = sc.nextLine().trim();

                    try {
                        int index = Integer.parseInt(input);

                        if (index >= 1 && index <= mediaList.size()) {
                            Playable selected = mediaList.get(index - 1);
                            selected.play();
                        } else {
                            System.out.println("Invalid media number.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "5":
                    System.out.println("Exiting Media Library. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}