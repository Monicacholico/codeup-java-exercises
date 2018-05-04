public class User {
    // instance variables
    public String username;
    public String email;
    public String password;
    public boolean isAdmin;

    // this is "protected" so the only code that can
    // change this value lives on this class
    // the reason why this is static is b/c we need to:
    // store a record of how many users we have,
    // wheter or not we've made any objects
    protected static int numberOfUsers = 0;


    public static int getNumberOfUsers(){
        return numberOfUsers;
    }

    // Constructor is the function calle on object creation
    // method overloading
    public User(){
        numberOfUsers++;
//        numberOfGuests++;
    }

    public User(String password, String email, String username){
        this.password = password;
        this.email = email;
        this.username = username;
    }



    // this instead of repeating every instance variables
//    public User(String email, String username, String password, boolean isAdmin)
//    this.email = email;
//    this. username = username;
//    this.password = password;
//    this.isAdmin = isAdmin;


}


