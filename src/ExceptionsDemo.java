import util.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {


//        int number = getNumberAtIndex();

        try{
            getFavoriteFood();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("y' know, yo really need to restar the app and say you like pizza");
        }


    }

    protected static void getFavoriteFood () throws  Exception{
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("What's your favorite food?");
        String food = scan.next();
        if(!food.equalsIgnoreCase("pizza")){
            throw new Exception ("The application breaks unless your favorite food is pizza");
        }
        System.out.println("Good, yay!, Welcome to the pizza club");

    }

//    protected static int getNumberAtIndex() throws ArrayIndexOutOfBoundsException{
//        Input input = new Input();
//        int[] numbers = {5, 6, 7, 8};
//        System.out.println("Please input the index of the element you want to access");
//        int index = input.getInt();
//
//        if(index < 0 || >= numbers.length){
//            throw new ArrayIndexOutOfBoundsException("Not element at that index!");
//        }
//
//        try{
//
//            index = input.getInt();
//            return numbers[index];
//        }
//    }



//        throw new Exception("this is an exception");
//        System.out.println("this should never run");

//        int[] number = {5, 6, 7, 8};
//
//        System.out.println(numbers[44]);
//
//        Input input = new Input;
//        System.out.println("Please input your favorite number");
//        int favoriteNumber = input.getInt();
//
//        System.out.println("You said your favorite number is: " + favoriteNumber);


        // --------------------  UNCHECKED EXCEPTIONS ------------------------------------------------------
//        try {
//
//            Input input = new Input();
//
//            int[] numbers = {5, 6, 7 8};
//
//            System.out.println("Please input the index of the element you want to access...");
//            int index = input.getInt();
//
//            System.out.println(numbers[index] + "is the number at the provided index");
//
//        } catch (Exception e){
//            System.out.println(e.toString());
//        }
//        System.out.println("this ran after the try/catch");





}
