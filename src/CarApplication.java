public class CarApplication {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("");

        System.out.println("Welcome to the HR application");
        System.out.println("Currently, we have " +  User.getNumberOfUsers() + " of users");

        User luis = new User( "Luis@codeup.com", "montealegreluis", "password123");

//        User luis = new User();
//        luis.email = "Luis@codeup.com";
//        luis.username = "montealegreluis";
//        luis.isAdmin = true;

        System.out.println(luis.username + "'s emai address is " + luis.email);



        User erik = new User();
        erik.email = "erik@codeup.com";
        erik.username = "codeoferikhansen";
        erik.password = "supersecurepassword";


        System.out.println("We now have " + User.getNumberOfUsers() + " in the application");

//        User guest = new User ("mickeymouse@gmail.com");
//        User guest1 = new User ("mickeymouse@gmail.com");

//        System.out.println(guest);
//
//        System.out.println("The guest's username is " + guest.username);
//        System.out.println("is the guest an admin? " + guest.isAdmin);

    }
}
