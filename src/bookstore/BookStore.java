package bookstore;


import util.Input;

import java.util.Random;

public class BookStore {

    public static Person [] persons = new Person[8];
    public static Book [] books = new Book[5];
//    static Author [] authors = new Author[3];
    public static Random random = new Random();

//    String userChoice = input.getString();

    public static void showBooks(Book[] books){
        for(Book book: books){
//            for(Person person: persons)
                System.out.println(book.getTitle() + " with a price of " + book.getPrice());
        }
    }
//
    public static Book randomBook(Book [] books){
        int index = random.nextInt(books.length);
        return books[index];
    }
//
    public static Person randomCustomer(Person [] persons){
        int index = random.nextInt(persons.length);
        return persons[index];
    }



    public static void whobuyBooks(Person [] persons) {
        for (Person person : persons) {
            for (Book book : books) {
                System.out.println(person.getName() + " bought the book " + book.getTitle());
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to our Book Store, This is our list of available Books: \n");
//        System.out.println("How many books would you like to buy?");
//        Input input = new Input();

//        System.out.println(randomCustomer(persons) + "bought the book " + randomBook(books));

        persons[0] = new Customer("Flora");
        persons[1] = new Customer("Clara");
        persons[2] = new Customer("Juana");
        persons[3] = new Customer("Mary");
        persons[4] = new Customer("Olympia");
        persons[5] = new Customer("Simone");
        persons[6] = new Customer("Silvia");
        persons[7] = new Customer("Ada");
        books [0] = new Book("The Fountain Head",15, "Ayn Rand", 6);
        books [1]= new Book("The Caliban and the Witch", 25, "Silvia Federici",29 );
        books [2]= new Book("The Tenant of Wildfell Hall", 10, "Anne Bronte", 1);
        books [3]= new Book("Women who run with wolves", 30, "Clarissa Pinkola Estes",48 );
        books [4]= new Book("Arrancame la vida", 23, "Angeles Mastretta",36 );
//        authors[0] = new Author("Jane Austen", 14);
//        authors[1] = new Author("Doris Lessing", 50);
//        authors[2] = new Author("Sara Sefchovich", 18);



        showBooks(books);
        whobuyBooks(persons);
    }



}
