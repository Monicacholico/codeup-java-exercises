package bookstore;

public class Author extends Person {

    public int booksWritten;


    public Author(String name, int booksWritten){
        super(name);
        this.booksWritten = booksWritten;
    }

    public String getAuthorName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getbooksWritten(){
        return booksWritten;
    }

    public void setbooksWritten(int booksWritten){
        this.booksWritten = booksWritten;
    }

}
