package bookstore;

public class BookStore {

    static Person [] persons = new Person[8];
    static Book [] books = new Book[5];
    static Author [] authors = new Author[3];

    public static void main(String[] args) {

        persons[0] = new Customer("Flora");
        persons[1] = new Customer("Clara");
        persons[2] = new Customer("Juana");
        persons[3] = new Customer("Mary");
        persons[4] = new Customer("Olympia");
        persons[5] = new Customer ("Simone");
        persons[6] = new Customer ("Silvia");
        persons[7] = new Customer ("Ada");
        books [0] = new Book("The Fountainhead", 30, "Ayn Rand",);
        books [1]= new Book("The Caliban and the Witch", 25, "Silvia Federici");
        books [2]= new Book("The Tenant of Wildfell Hall", 10, "Anne Bronte");
        books [3]= new Book("Women who run with wolves", 30, "Clarissa Pinkola Estes");
        books [4]= new Book("Arrancame la vida", 23, "Angeles Mastretta");
        authors[0]= new Author("Jane Austen", 14);
        authors[1]= new Author("Doris Lessin", 50);
        authors[2]= new Author("Sara Sefchovich", 18);


//        buyBooks(persons);
        System.out.println(persons);

        }

    public static void buyBooks(Person [] persons){
        for(Person person : persons){
            System.out.println( person.getName() + "bought the books ");
        }
    }


}
