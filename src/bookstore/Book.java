package bookstore;

public class Book extends Product {

    public Author author;


    public Book(String title, double price,  Author author ){
        super(title, price);
        this.author = author;
    }
}


