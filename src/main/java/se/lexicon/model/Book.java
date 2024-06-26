package se.lexicon.model;

import java.util.UUID;

public class Book {
    // todo: needs completion
    private String id;

    private String title;

    private String author;

    private boolean available = false;

    private Person borrower;

    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString().substring(0,7);
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        this.borrower = borrower;
        this.available = false;
    }

    public String getId() {
        return id;
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
    
    public boolean getAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
         this.borrower = borrower;
    }

    public String getBookInformation() {
        return "Id: " + id + "," + "Title: " + title + "," + "Author: " + "," + author + "," + "IsAvailable: " + available;
    }

    public void changeAvailability (boolean availability) {
        available = availability;
    }
}