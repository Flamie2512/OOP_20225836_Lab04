package hust.soict.dsai.aims.media;  // Correct package

public class Disc extends media {

    private String director;
    private int length;  

    public Disc(String title, String category, String director, int length, float cost) {
        super(0, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
