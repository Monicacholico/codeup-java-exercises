public class HelloWorld {
        public static void main (String[] args) {
            System.out.print("Hello, World!");
            System.out.println("The shortcut to make a main method is psvm");
            System.out.println("The shortcut for System.out.println is sout");



            int myFavoriteNumber;
            myFavoriteNumber = 13;
            System.out.println(myFavoriteNumber);

            String myString;
            myString = "This is my very first java class";
            System.out.println(myString);


//            myString = 'm';
//            System.out.println(myString);
            // myString - assigning a char to a string is a compilation error

//
//            myString = 3.14159;
//            System.out.println(myString);
            // can't assign a number to a String variable





            long myNumber;

//            myNumber = 3.14; // cannot assign a double to a long w/o explicit casting
//            System.out.println(myNumber);
             myNumber = (long) 3.141; //will work b/c of the explicit casting.
            System.out.println(myNumber);
//
//            myNumber = 123L;// the L appended to the end is part of how we know this is a
//
//            myNumber = 123; // works ok b/c
//            System.out.println(myNumber);

//            float meNumber = myNumber;
//            meNumber = 3.14;
//            System.out.println(meNumber);
            //

            float someNumber = (float) 3.141;
            System.out.println(someNumber);
//
//            double isanotherNumber = meNumber;
//            isanotherNumber = 3.141596;
//            System.out.println(isanotherNumber);


//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//            int class;
//            class = 5;


//            int x = 4;
//            x += 5;
//            System.out.println(x);

//            int x = 3;
//            int y = 4;
//            y *= x;
//            System.out.println(x);
//            System.out.println(y);
//
            int x = 10;
            int y = 2;
            x /= y;
            y -= x;
            System.out.println(x);
            System.out.println(y);

        }


}



//  ================== THIS IS AN EXAMPLE IN RYAN'S CLASS ======================
//public class HelloWorld {
//    public static void main (String[] args) {
//        // variable declaration
//        String message;
//
//        // variable assignment, first time assignment is called initialization
//        message = "Hello World";
//        System.out.println(message);
//
//        // declare/initialize on one line
//        int favoriteNumber = 23;
//        System.out.println("My favorite number is" + favoriteNumber);
//
//        // reassignment of variable
//        favoriteNumber = 5;
//        System.out.println("Now my favorite number changed to " + favoriteNumber);
//
//
//        int age = 19;
//
//        // declare the variable
//        boolean canRentCar;
//
//        //conditional assignment
//        if(age >25){
//            canRentCar = true;
//        } else {
//            canRentCar = false;
//        }
//    }
//}


