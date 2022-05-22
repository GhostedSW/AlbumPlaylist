package Musics;

public class Song {
    String  title;

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    Double  duration;


    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
