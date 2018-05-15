package util;

import java.util.Scanner;

public class Input {

    private Scanner input;

    public Input() {
        this.input = new Scanner(System.in);
    }

    public String getString() {
        return input.nextLine();
    }

    public boolean yesNo() {
        String answer = input.nextLine();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int value = getInt();
        if (value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }

//    public int getInt( int min, int max){
//        int value = getInt();
//        if (value < min || value > max){
//            System.out.printf("Enter a number between %d and %d%n", min, max);
//            return getInt(min, max);
//        }
//        return value;
//    }


    public int getInt() {
        String input = getString();
        int output;

        try {
            output = Integer.valueOf(input);
            return output;
        } catch (NumberFormatException e) {
            System.out.println("Must input an integer");
            return getInt();
        }

    }

    //    public int getInt(){
    //        return input.nextInt();
    //    }
    //

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
//            System.out.println("Enter a number between .1 and 10.00");
        double value = getDouble();
        if (value < min || value > max) {
//            System.out.printf("Enter a number between %f and %f%n", min, max);
            return getDouble(min, max);
        }
        return value;
    }

    public double getDouble() {
        String input = getString();

        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Input must be a number");
            return getDouble();
        }

    }

//        public double getDouble(){
//            double number = input.nextDouble();
//            input.nextLine();
//            return number;
//        }


}

/*  LUIS EXAMPLES TO RESOLVE EXERCISE ======================


public class Input {

    // option 1) Inline the assignment
    // private Scanner scanner = new Scanner(System.in); // null

    private Scanner scanner;

    // option 2) -> Create a constructor

    public Input(){
    scanner = new Scanner(System.in);
    }

    public String getString(){

    }

    public boolean yesNo(){
     String answer = scanner.nextLine();
    }

    public int getInt(int min int, int max){
    return 0;
    }


}



 */