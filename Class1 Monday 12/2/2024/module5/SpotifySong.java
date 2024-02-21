

public class SpotifySong {
    
    private String title;
    private String artist;
    private String album;
    private String genre;
    private int duration;
    private int release_year;
    private int popularity;

    public SpotifySong(String title, String artist, String album, String genre, int duration, int release_year){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
        this.release_year = release_year;
        this.popularity = 0;
    }


    public SpotifySong() {
        this.artist="unkown";
        this.album = "unknow";
        this.title = "unknow";
        this.genre = "unknown";
        this.duration = 0;
        this.release_year = 0000;
        this.popularity = 0;

}

public String getTitle() {
    return title;
}

public String getArtist() {
    return artist;
}

public int getDurationInSeconds() {
    return duration;
}

public String getAlbum() {
    return album;
}

public String getGenre() {
    return genre;
}

public int getReleaseYear() {
    return release_year;
}

public int getPopularity() {
    return popularity;
}

public void updatePopularity(int newPopularity) {
    this.popularity = newPopularity;
}


public boolean isPopular(int popularityThreshold) {
    return popularity >= popularityThreshold;
}

@Override
public String toString() {
    return "SpotifySong{" +
            "title='" + title + '\'' +
            ", artist='" + artist + '\'' +
            ", durationInSeconds=" + duration +
            ", album='" + album + '\'' +
            ", genre='" + genre + '\'' +
            ", releaseYear=" + release_year +
            ", popularity=" + popularity +
            '}';
}

public static void main(String[] args) {

    SpotifySong popularSong = new SpotifySong("Avid","Hiroyuki Sawano","86 eighty six","JPop",325,2022);


    SpotifySong lessPopularSong = new SpotifySong("Our story","tieff","shifting horizons","instrumental",240,2018);


    System.out.println("Popular Song: " + popularSong.toString());
    System.out.println("Less Popular Song: " + lessPopularSong.toString());

    int popularityThreshold = 750000;
    System.out.println("Is Popular Song Popular? " + popularSong.isPopular(popularityThreshold));
    System.out.println("Is Less Popular Song Popular? " + lessPopularSong.isPopular(popularityThreshold));


    popularSong.updatePopularity(1200000);
    lessPopularSong.updatePopularity(20000);
    System.out.println("Updated Popular Song: " + popularSong.toString());
}
}
