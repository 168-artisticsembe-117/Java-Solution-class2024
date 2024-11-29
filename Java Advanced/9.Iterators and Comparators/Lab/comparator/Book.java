package mlc.advanced.iterator.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setAuthors(String... authors) {
        if(authors.length == 0)
            this.authors = new ArrayList<>();
        else
            this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", title, year);
    }
}
