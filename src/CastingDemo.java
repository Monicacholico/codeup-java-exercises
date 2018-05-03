import java.sql.SQLOutput;


//public class CastingDemo {
//    public static void main(String[] args) {
//        //Explicit casting. We have to explicitly cast if we're losing data
//        double pi = 3.1415926;
//
//        // treat the variable on the right of (int) as an int
//        int almostPi = (int) pi;
//        System.out.println(almostPi);
//
//
//        // implicit casting is also called widening conversion
//        short favoriteNumber = 23;
//
//        double someNumber = favoriteNumber;
//        System.out.println(someNumber);
//
//
//
//    }
//}

//    public static void main(String[] args) {
//        String userInput;
//        //Declaring a variable
//        Scanner sc;
//
//        // assigning a new scanner object to the sc variable
//        sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine(); // if you ever need to "clear out" the scanner before the next input.
//        userInput = sc.next(); // sc.next listened up until a space character, but we still had
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//        int favoriteNumber;
//        System.out.println("Please input your favorite number: ");
//        favoriteNumber = sc.nextInt();
//        System.out.println("You entered the number : " + favoriteNumber);
//    }



// ================== RYAN'S EXAMPLE FOR EQUALS IN BOOLEANS =======================

//public class StringDemo {
//    public static void main(String[] args) {
//        String name = "Jane";
//        String otherName = "Jane"; // scan.next();
//
//
//        boolean result = name.equals(otherName)// instead of  name == otherName;  or equalsIgnoreCase for sensitive case
//
//        if (result) {
//            System.out.println("These are the same object");
//        } else {
//            System.out.println("Thise are Not the same object");
//        }
//
//        System.out.println("== with string is compring th object. Not all the caharacters");
//    }
//}

// ============= RYAN'S OTHER EXAMPLE FOR EQUALS IN A BOOLEAN ===============================


//public class StringDemo {
//    public static void main(String[] args) {
//        String name = "Jane";
//        String otherName = "Jane"; // scan.next();
//        String inputName = scan.next();
//
//
//        if (name.equals(inputName)){
//            System.out.println("The sequence of characters of each name is the same.");
//        } else if (name == inputName){
//            System.out.println("The strings are the same object");
//        }
//    }
//}


// ========= RYAN'S EXAMPLE WITH A DO WHILE =====================

//public class StringDemo {
//    public static void main(String[] args) {
//        int i = 1 ;
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("and back down...");
//
//        do{
//            System.out.println(i);
//            i--;
//        }while (i >= 0);
//
//        System.out.println(i);
//
//        System.out.println("Below is the for loop");
//        for (int x = 1; x <= 10; x++) {
//            System.out.println(x);
//        }
//
//    }
//}

// ============= RYAN'S CLASS ON JAVA METHODS ========================

//public class MethodDemo {
//    public static void main(String[] args) {
//        sayHello();
//        sayHello("LUis");
//        sayHello("Luis Montealegre");
//    }
//
//    public static void greeting(){
//        System.out.println("Hi, nice to meet you");
//    }
//
//    public static boolean isPizza(String someString){
//        return someString.equalsIgnoreCase();
//    }
//
//    // method overloading
//    public static void sayHello(){
//        System.out.println("Hello, World");
//    }
//
//    public static void sayHello (String name){
//        System.out.println("Hello, " + name);
//    }
//
//    public static sayHello(String firstName, String lastName){
//        String fullName = fullName(firstName, lastName);
//        System.out.println("Greetings, " + fullName);
//    }
//
//    public static String fullName(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }
//
//    public static double quotient (int numerator, int divisor){
//        return numerator / divisor;
//    }
//
//    public static String favNumber (int number){
//        return "You said your favorite number is " + number;
//    }
//
//    public static int favoriteNumber(){
//        Scanner input = new Scanner (System.in).useDelimiter("\n");
//        greeting();
//        int number = input.nextInt();
//
//        System.out.println("Hi, nice to meet you. ");
//    }
//
//    public static boolean wantsToContinue (){
//        Scanner input - new Scanner(System.in).useDelmiter("\n");
//        System.out.println("Press yes to continue");
//        String userChoice = input.next();
//        boolean result = userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase()
//        return result;
//    }
//}


// ============= ESCAPES =========================



//        down vote
//        \ is used for escape sequences in programming languages.
//
//        \n prints a newline
//        \\ prints a backslash
//        \" prints "
//        \t prints a tabulator
//        \b moves the cursor one back


// ============ RECURSION ================================


//public class Recursion {
//    public static void main(String[] args) {
////        System.out.println(multiply(3, 6));
//        multiplyRecursive(
//    }
//
//
//    public static int multiplyRecursive(int multiplicand, int multiplier){
//        if( multiplier == 0){
//            return 0;
//        }
//        if(multiplier == 1){
//            return multiplicand;
//        }
//        return 100;
//    }
//
//    public static int multiply (int multiplicand, int multiplier){
//        int product = 0;
//        for (int i = 0; i < multiplier; i++){
//            product += multiplicand
//        }
//        return product;
//    }
//
//}
//
//
//public class Power {
//    public static void main(String[] args) {
//
//
//        // 2 ^ 6
//        // 2 ^ 2 ^5
//        // 2 ^ 2^4
//        // 2 ^ 2^3
//        // 2 ^ 2^2
//        // 2 ^ 2^1
//
//
//        // anything ^ 1  = Anything
//        // anything ^ 0 = 1
//        System.out.println(powerRecursive( 2, 4););
//
//
//
//    }
//
//
//    public static int powerRecursive( int number, int exponent){
//        if(exponent == 0) {
//            return 1;
//        }
//        if (exponent == 1){
//            return number;
//        }
//
//        return number * powerRecursive(number, exponent -1);
//    }
//
//
//
//    public static int power ( int number, int exponent){
//        int result = 1;
//        for ( int i = 0; i < exponent; i++){
//            result *= number;
//        }
//        return result;
//    }
//}
//
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        // 1 = fib(1)
//        // 1 = fib(2)
//
//        // 1 + 1 = 2 = fib(3)
//        // fib(1) + fib(2) = fib(3)
//        // 1 + 2 = 3 = fib(4)
//        // fib(2) + fib(3) = fib(4)
//        // 2 + 3 = 5 = fib(5)
//        // fib(3) + fib(4) = fib(5)
//        // 3 + 5 = 8 = fib(6)
//        // fib(4) + fib(5) = fib(6)
//        // 5 + 8 = 13 = fib(7)
//        // fib(5) + fib(6) = fib(70
//        // 8 + 13 = 21 = fib(8)
//        // fib(6) + fib(7) = fib(8)
//        System.out.println(fib(9));
//
//    }
//
//    public static long fib(int number {
//        if(number == 1){
//            // this would be better with an exception, which will learn later...
//            System.out.println("Enter a number greater that or equals to 1");
//            return 1;
//        }
//        if (number == 2){
//            return 1;
//        }
//        return fib(number -2) + fib (number -1);
//    }
//
//}