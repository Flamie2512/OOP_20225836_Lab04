package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {

    private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost); 
        this.artist = artist;
        this.tracks = new ArrayList<>();  
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public List<Track> getTracks() {
        return tracks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CD - ").append(getTitle()).append(" - ").append(getCategory())
          .append(" - ").append(getArtist()).append(" - ").append(getLength())
          .append(" mins: ").append(getCost()).append(" $").append("\nTracks:\n");

        for (Track track : tracks) {
            sb.append(track.toString()).append("\n");
        }

        return sb.toString();
    }

    // Getter and setter for artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
