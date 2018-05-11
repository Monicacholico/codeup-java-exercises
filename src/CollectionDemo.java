import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {
    public static void main(String[] args) {

        HashMap<String, String> instructors = new HashMap<>();
        // username as the key and email as the value
        instructors.put("ryanorsingr", "ryan@codeup.com");
        instructors.put("zguilde", "zach@codeup.com");
        System.out.println(instructors);


        ArrayList<String > names = new ArrayList<>();

        names.add("Sandi");
        names.add("Adda");
        names.add("Linda");

        for(String name : names){
            System.out.println(name);
        }

        names.contains("Bob");{
            System.out.println("Bob's not here");
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(5);

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Batman"));
        people.add(new Person("Wonder Woman"));

    }
}

