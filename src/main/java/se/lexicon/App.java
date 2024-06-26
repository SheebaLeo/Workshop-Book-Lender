package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        // Display book information
        Book book = new Book("Harry Potter", "Rowling");
      //  System.out.println(book.getBookInformation());

        // Create a person instance
        // Display person information
        Person person = new Person("Amira", "Christopher Leo");
        //System.out.println(person.getPersonInformation());

        // Loan a book to the person
        Person person1 = new Person("Sheeba", "Leo");
       /* Book book1 = new Book("Harry Potter", "Rowling", person1);
        person1.loanBook(book1, person1);*/
        Book book1 = new Book("Harry Potter", "Rowling");
        person1.loanBook(book1);


        // Display person information after borrowing a book
        System.out.println("person information after borrowing a book" + book1.getBorrower().getPersonInformation());

        // Display book information after borrowing a book
        System.out.println("book information after borrowing a book" + book1.getBookInformation());

        // Return the borrowed book
        Book book2 = new Book("Harry Potter", "Rowling");
        person1.returnBook(book1);

        // Display person information after borrowing a book
        System.out.println("person information after returning a book" + book1.getBorrower().getPersonInformation());

        // Display book information after borrowing a book
        System.out.println("book information after returning a book" + book1.getBookInformation());

        // Display person information after returning the book
        // Display book information after borrowing a book
        Person person2 = new Person("Sheeba", "Leo");
        Book book3 = new Book("Harry Potter", "Rowling", person2);


    }

}
