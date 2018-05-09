package bookstore;

public class Book extends Product {

    public Author author;


    public Book(String title, double price, String name, int booksWritten){
        super(title, price);
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String title){

        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }



}


