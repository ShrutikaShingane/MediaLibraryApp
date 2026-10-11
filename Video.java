package medialibrary;

public class Video implements Playable {

    private String title;
    private String creator;

    public Video(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title
                + " by " + creator);
    }

    @Override
    public String toString() {
        return "Video: " + title + " | Creator: " + creator;
    }
}