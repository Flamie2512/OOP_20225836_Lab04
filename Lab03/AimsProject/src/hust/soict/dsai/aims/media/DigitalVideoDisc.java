package hust.soict.dsai.aims.media;  // Move to the correct package

public class DigitalVideoDisc extends Disc {

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nbDigitalVideoDiscs++;
    }

    public int getId() {
        return super.getId();
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public boolean isMatch(String title) {
        return this.getTitle().equalsIgnoreCase(title);
    }
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + " mins: " + getCost() + " $";
    }
}
