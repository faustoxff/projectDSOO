package Models;

import java.util.Objects;


public class Books {
    private String title;
    private String author;
    private int date;

    public Books(String title, String author, int date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.author);
        hash = 67 * hash + this.date;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Books other = (Books) obj;
        if (this.date != other.date) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", author=" + author + ", date=" + date + '}';
    }
    
    
}
