package se.lexicon.model;

public class Person {
    // todo: needs completion

    private int sequencer = 0;

    private int id;

    private String firstName;

    private String lastName;

    private Book bookBorrowed;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookBorrowed = getBookBorrowed();
    }

    public int getSequencer() {
        return sequencer;
    }

    public void setSequencer(int sequencer) {
        this.sequencer = sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(Book isLoned) {
        this.bookBorrowed = isLoned;
    }

    private int getNextId() {
        return ++sequencer;
    }

    /*public void loanBook(Book book, Person person) {

        if (book.getBorrower() != null) {
            person.setBookBorrowed(book);
        } else {
            throw new IllegalArgumentException("Borrower should not be null");
        }
    }*/

    public void loanBook(Book book)  {
        if (book.getBorrower() == null && book.getAvailable() == true) {
            Person person2 = new Person("Ananaya", "Christopher Leo");
            person2.setBookBorrowed(book);
            book.setBorrower(person2);
            book.changeAvailability(false);
        } else {
            throw new IllegalArgumentException("Book is already borrowed");
        }
    }



    public void returnBook (Book book) {
        if (book.getAvailable() == false && book.getBorrower() != null) {
            Person person = new Person("", "");
            person.setBookBorrowed(book);
            book.setBorrower(person);
            book.changeAvailability(true);
        } else {
            throw new IllegalArgumentException("Book is not borrowed");
        }
    }

    public String getPersonInformation() {
        return "Id: " + id + "," + "first name: " + firstName + "," + "last name: " + lastName + "," + "Books borrowed: " + bookBorrowed;
    }
}