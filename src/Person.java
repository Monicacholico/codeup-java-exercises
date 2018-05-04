
public class Person {
    private String name;

    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
     public Person(String name){
        this.name = name;
     }

     public Person(){

     }


    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Juan");
        System.out.println(person.getName());
        person.sayHello();


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }




}

/* =========== LUIS EXAMPLES TO SOLVE EXERCISES ==============

// Create person class inside of src

public class Person {

// private name property that is a string
// property / field/ attribute / instance variable

private String name;


// The class should have a constructor that accepts a string value and sets the person's name to the passed string.
public Person(String name){
setName(name);




//returns the person's name
// method's signature
// getter -> prefix get
public String /return type/ getName /method name/ (/number of parameters, names/types){  // method's signature

public String(){
return null;
}

// changes the name property to the passed value

public void setName(String name) {
(if (name.isEmpty()) System.out.println ("That is invalid!");
else this.name = name;

}

// prints a message to the console using the person's name
public void sayHello(){
System.out.printf("Hello %s!%n, name);

}

public void nameToUppercase(Person person){
person.setName(person.getName());


// Create a main method

    public static void main(String[] args){
    Person person = new Person("Ryan");
    System.out.println(person.getName());
    person.setName("Ryan 2.0");
    person.sayHello();

    person.nameToUppercase(person2);
    person2.sayHello();
    person1.sayHello();

    }


}






 */




