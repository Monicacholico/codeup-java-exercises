import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while( i <= 15){
//            System.out.println( i );
//            i++;
//        }


//        int i = 0;
//        do{
//            System.out.println(i);
//            i +=2;
//        } while ( i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i = i - 5;
//        } while ( i <= -10);


//        double i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i <= 65536);


//   ======== REFACTORING PREVIOUS EXERCISES TO LOOPS =================

//        System.out.println("before the loop");
//        for (int i = 100; i >= -10; i = i -5){
//            System.out.println(i);
//        }
//
//        System.out.println("before the loop");
//        for ( long i = 2; i <= 6536; i = i * i ){
//            System.out.println(i);
//        }

// =================== FIZZBUZZ EXERCISE ===================


//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//            if( i % 3 == 0){
//                if(i % 5 == 0) {
//                    System.out.println("fizzbuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else if( i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//        } while (i <= 100);

        // do a for loop

//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//            if( i % 15 == 0){
//                System.out.println("fizzbuzz");
//                } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//                } else( i % 5 == 0) {
//                System.out.println("Buzz");
//                }
//        } while (i <= 100);



// ============= TABLE OF POWERS ==================


//        System.out.println("Enter a number");
//        Formatter fmt;
//        for (int i = 1; i <= 10; i++) {
//            fmt = new Formatter();
//
//            fmt.format("%4d %4d %4d", i, i * i, i * i * i);
//            System.out.println(fmt);
//        }

// ================ GRADES INTO LETTER GRADES ============


//        Scanner sc;
//        sc = new Scanner(System.in);
//        System.out.println("Enter a number from 0 to 100");
//        int userInput = sc.nextInt();
//        if (userInput <= 100 && userInput > 88) {
//            System.out.println("A");
//        } else if (userInput <= 87 && userInput > 80) {
//            System.out.println("B");
//        } else if (userInput <= 79 && userInput > 67) {
//            System.out.println("C");
//        } else if (userInput <= 66 && userInput < 60) {
//            System.out.println("D");
//        } //else (userInput < 59 && userInput > 0) {
//            System.out.println("F");
//        }

        grades();
    }
}

//      LUIS EXAMPLES FOR EXERCISES

//
//        int/*type declaration */ i; // variable declaration, followed by an assignment
//
//        for( i = 5; // initialization
//             i <= 15; // boolean expression  -> the condition to stop
//             i++ // increment
//         ){
//            System.out.println(i);
//        }
//
//
//        for ( i = 0; i <=100 /* condition to continue*/ i += 2 )
//        { // do while body
//            System.out.println(i);
//        }
//
//            String fizzBuzz = "";
//            for (int i = 1; i < 100; i++){
//            if ( i % 3 == 0 ){
//                fizzBuzz = "fizz";
//            } if ( i % 5 == 0) {
//                fizzBuzz += "buzz";
//            } else if (fizzBuzz.isEmpty()){
//                fizzBuzz = String.valueOf(i);
//        }
//                System.out.println(fizzBuzz);
//        }


//        Scanner input = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int number = input.nextInt();
//
//        System.out.println("Here is your table");
//        System.out.println("number | square | cubed");
//        System.out.println(" ----- | ------- | -----");
//
//        for ( int i = 1; i < number; i++){
//            System.out.println(i + "      | " + i * i + "     |" + i * i * i);
//            System.out.println(" %d  | %d    |% d    |", i, i * i, i * i * i);
//        }
//
//
//        System.out.println(number);



// ============ RYAN'S  EXAMPLE TO RESOLVE GRADES WITH LETTERS =======================

public static void grades (String[] args) {
    Scanner input = new Scanner(System.in);
    String letterGrade;
    String userChoice;
    short gradeNumber;
    int gradeTotal;
    int numberOfGrades;
    int average;

do {
    System.out.println("Please input the student's grade between 0 an 100");
    gradeNumber = input.nextShort();
    if (gradeNumber >= 90) {
        letterGrade = "A";
    } else if (gradeNumber >= 80) {
        letterGrade = "B";
    } else if (gradeNumber >= 70) {
        letterGrade = "C";
    } else if (gradeNumber >= 60) {
        letterGrade = "D";
    } else if (gradeNumber >= 0 && gradeNumber <= 59) {
        letterGrade = "F";
    } else {
        letterGrade = "This is not a valid grade. Please try again";
    }

    System.out.println("The calculated grade for " + gradeNumber + "is a grade of: " + letterGrade);

    System.out.println("Do you want to calculate another grade?");
    userChoice = input.next();

} while (userChoice.equalsIgnoreCase(anotherString: "y") || userChoice.equalsIgnoreCase (anotherString: "yes"));

    average = gradeTotal / numberOfGrades;
    System.out.println("The average grade for all assignments is: " + average);
    System.out.println("The average letter grade is : " + letterGrade(average));
    }
}




