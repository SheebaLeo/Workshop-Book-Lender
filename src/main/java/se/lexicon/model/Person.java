package se.lexicon.model;

public class Person {
    // todo: needs completion

    private int sequencer = 0;

    private int id;

    private String firstName;

    private String lastName;

    private Book bookBorrowed;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getNextId() {

       // if (id != 0) {
            int nextId = ++sequencer;
            return nextId;
       // }
    }

    public void loanBook(Book book, Person person) {

        if (book.getBorrower() != null) {

            Book bookBorrowed = new Book(book.getTitle(), book.getAuthor());
            person.setBookBorrowed(book);
            bookBorrowed.setBorrower(person);
        }
    }



    public void returnBook (Book book) {
        if (book.getAvailable() == false) {
            bookBorrowed.getAvailable();
            Person person = new Person("", "");
            book.setBorrower(person);
            person.bookBorrowed = book;
        }
    }

    public String getPersonInformation() {
        return "Id: " + id + "," + "first name: " + firstName + "," + "last name" + lastName + "," + "Books borrowed: " + bookBorrowed;
    }
}