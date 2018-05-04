

public class PersonApplication {
    public static void main(String[] args) {
        Personx person = new Personx();
        System.out.println(person.lastName);
        System.out.println(person.name);

        person.lastName = "Mendoza";
        System.out.println(person.lastName);

        person.name = "Fer";
        System.out.println(person.name);

//        public Personx = new Personx();

        Personx person2 = new Personx(); // constructor its name is the same as the class
        person2.name = "Ryan";


        System.out.println(person2.name);

        System.out.println(person.fullName());
        System.out.println(person2.fullName());

        Personx person3 = new Personx();

//        System.out.println(Person.counter);
        java.util.Scanner scanner;


    }

}
