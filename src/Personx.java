public class Personx {

        public String name;
    public String lastName;
    public int counter = 0; // instance variables

    public Personx() {counter ++;}

    //    Instance Method
    public String fullName(){
        return String.format( "%s %s", name, lastName); }

    public String yellName(){
        return  name.toUpperCase(); }

}
