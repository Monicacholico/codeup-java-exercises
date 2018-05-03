import java.util.*;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(division(15, 3));
        System.out.println(multiplication(5, 5));
        System.out.println(addition(5, 6));
        System.out.println(subtraction(20, 5));
        System.out.println(modulus(35, 3));

        System.out.println(getInteger(1,10));


        System.out.println("Enter a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        fact = factorial(n);
        System.out.println("Factorial of " + n + " is: "  + fact);


        do {
            int sides = askForNumberOfSides();
            rollDiceMessage();

            int dice1 = roll(sides);
            int dice2 = roll(sides);

            System.out.printf("Dice 1 is %d, Dice 2 is %d ", dice1, dice2);
        } while (wantsToContinue());


        int randomNUmber = gamePickNumber();
        int guess;
        System.out.println(randomNUmber);
        do {
            guess = userPickNumber();
            if(guess < randomNUmber){
                System.out.println("HIGHER");
            } else if (guess > randomNUmber){
                System.out.println("LOWER");
            } else{
                System.out.println("GOOD GUESS");
            }
        } while (guess != randomNUmber);


//        System.out.println("Pick a number between 1 and 100");
//        Scanner input = new Scanner(System.in);
//        int randomNumber = input.nextInt();
//        int guessedn = 1;
//        guessedn = game101(randomNumber);
//        System.out.println("Factorial of " + randomNumber + " is: "  + guessedn);
    }


// ================== BASIC ARITHMETIC =========================================

    public static int addition(int addendone, int addendtwo) {
        return addendone + addendtwo;
    }

    public static int subtraction(int minuendo, int substrahend) {
        return minuendo - substrahend;
    }

    public static int multiplication(int multiplicand, int multiplier) {

        return multiplicand * multiplier;
    }

    public static int division(int numerator, int divisor) {
        return numerator / divisor;
    }

    public static int modulus(int numberone, int numbertwo) {

        return numberone % numbertwo;
    }

// ====================== USER INPUTS AMONG A RANGE OF NUMBERS ========================

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        if (userNumber > 0 && userNumber < 11){
            System.out.println("Good! your number is " + userNumber);
            return userNumber;
        } else {
            System.out.println("You're not entering a valid number");

        }
        return getInteger(min, max);

    }

// =========== THIS IS FOR PROMPTING THE USER ============================

//    public static int prompt(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        return sc.nextInt();
//    }

// ============ FACTORIAL NUMBER =======================================


    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

// =================== ROLLING DICES ======================================


    public static int askForNumberOfSides() {
    Scanner input = new Scanner(System.in);
        System.out.println("How many sides?");
        return input.nextInt();

    }

    public static void rollDiceMessage(){
        System.out.println("Hit enter to roll the dices");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

    public static int roll (int sides){
        return (int)(Math.random() * sides) + 1;
    }

    public static boolean wantsToContinue(){
        System.out.println("Do you want to roll the dice again? y/n");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }


// ================= GAME DEVELOPMENT 101 ===================================


    public static int gamePickNumber(){
        return (int) (Math.random() * 100) + 1;
    }

    public static int userPickNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number");
        return input.nextInt();
    }





//    public static int game101(int randomNUmber){
//        for ( i = 0; i <=100 /* condition to continue*/ i ++ )
//        { // do while body
//            System.out.println("Pick a number between 1 and 100");
//            if(randomNUmber > 0 && )
//        }
//
//    }


}



// ======================== RYAN'S SOLVING PROBLEMS ================================

/*

================ GET INTEGER =========================

IN THE MAIN METHOD





IN THE METHOD GETINTEGER

public static int getInt(){
Scanner scan = nes Scanner(System.in)useDelimiter("\n");
return scan.nextIn();

// sad path -> the number provided is outside of the range of provided min/max values

if (number < min || number > max){
return getInt(min, max);
}

// happy path
return number;

===============  FACTORIAL ================================


public static long factorial (int number) {
long total = 1;
for(int i = number; i > 1; i--) {
total *=1;
}
return total;
}

//output should look like this 4! = 1 x 2 x 3 x 4 - 24
public static void showFactorialOutput(int number){
String output = number + "! = ";

for (int i = 1; i <= number; i++) {
output += i " x ";
}

output += " = " + factorial(number);
System.out.println(output);

======================== ROLLING DICES =================================






 */

