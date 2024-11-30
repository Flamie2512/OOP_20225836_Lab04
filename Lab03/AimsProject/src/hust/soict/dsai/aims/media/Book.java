package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends media{
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.authors = new ArrayList<>();
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author " + authorName + " is already in the list.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author " + authorName + " is not in the list.");
        }
    }
}