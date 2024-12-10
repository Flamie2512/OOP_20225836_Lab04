package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;
    public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

    // Constructor
    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(0,title, category, cost, length, director);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("The track \"" + track.getTitle() + "\" has been added.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("The track \"" + track.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The track \"" + track.getTitle() + "\" is not in the list.");
        }
    }

    // Method to calculate the total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Getter for tracks
    public List<Track> getTracks() {
        return tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.artist);
        System.out.println("CD length: " + this.getLength() + " mins");
        for (Track track : tracks) {
            track.play(); // Play each track
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CD - ").append(getTitle()).append(" - ").append(getCategory())
          .append(" - ").append(artist).append(" - ").append(getLength())
          .append(" mins: ").append(getCost()).append(" $\nTracks:\n");

        for (Track track : tracks) {
            sb.append(track.toString()).append("\n");
        }

        return sb.toString();
    }
}
