package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();// instantiate an object / create an object
        System.out.println("Enter a word or sentence");
        System.out.println(input.getString());// inline variable -> it is the opposite of extract variable
        System.out.println("Do you want to continue (y/n)?");
        System.out.println(input.yesNo()); // cmd + opt + n
        System.out.println("Enter a number between 1 and 50");
        System.out.println(input.getInt(1, 50));
        System.out.println("Enter any integer number");
        int anyNumber = input.getInt();
        System.out.println(anyNumber);
        System.out.println("Enter a number between 1.0 and 10.00");
        double doubleInRange = input.getDouble(1.0, 10.00);
        System.out.println(doubleInRange);
        System.out.println("Enter any number");
        double anyDouble = input.getDouble();
        System.out.println(anyDouble);


    }
}
