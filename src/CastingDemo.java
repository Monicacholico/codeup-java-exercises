import java.sql.SQLOutput;


public class CastingDemo {
    public static void main(String[] args) {
        //Explicit casting. We have to explicitly cast if we're losing data
        double pi = 3.1415926;

        // treat the variable on the right of (int) as an int
        int almostPi = (int) pi;
        System.out.println(almostPi);


        // implicit casting is also called widening conversion
        short favoriteNumber = 23;

        double someNumber = favoriteNumber;
        System.out.println(someNumber);



    }
}

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

public class StringDemo {
    public static void main(String[] args) {
        String name = "Jane";
        String otherName = "Jane"; // scan.next();


        boolean result = name.equals(otherName)// instead of  name == otherName;  or equalsIgnoreCase for sensitive case

        if (result) {
            System.out.println("These are the same object");
        } else {
            System.out.println("Thise are Not the same object");
        }

        System.out.println("== with string is compring th object. Not all the caharacters");
    }
}

// ============= RYAN'S OTHER EXAMPLE FOR EQUALS IN A BOOLEAN ===============================


public class StringDemo {
    public static void main(String[] args) {
        String name = "Jane";
        String otherName = "Jane"; // scan.next();
        String inputName = scan.next();


        if (name.equals(inputName)){
            System.out.println("The sequence of characters of each name is the same.");
        } else if (name == inputName){
            System.out.println("The strings are the same object");
        }
    }
}


// ========= RYAN'S EXAMPLE WITH A DO WHILE =====================

public class StringDemo {
    public static void main(String[] args) {
        int i = 1 ;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
        System.out.println("and back down...");

        do{
            System.out.println(i);
            i--;
        }while (i >= 0);

        System.out.println(i);

        System.out.println("Below is the for loop");
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

    }
}

