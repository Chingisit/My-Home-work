package ru.davletbaev.task12;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    private static final long serialVersionUID = 6L;

    private String bookName;
    private String author;
    private LocalDate madeYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(LocalDate madeYear) {
        this.madeYear = madeYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", madeYear=" + madeYear +
                '}';
    }
}
