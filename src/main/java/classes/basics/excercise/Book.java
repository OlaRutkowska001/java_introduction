package classes.basics.excercise;

public class Book {

    private String title;
    private String author;
    private String publishData;
    private String isbn;

    public Book(String title, String author, String publishData, String isbn) {
        this.title = title;
        this.author = author;
        this.publishData = publishData;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishData() {
        return publishData;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishData='" + publishData + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

