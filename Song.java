package medialibrary;

public class Song implements Playable {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title
                + " by " + artist);
    }

    @Override
    public String toString() {
        return "Song: " + title + " | Artist: " + artist;
    }
}