import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        Scanner sc;
//        sc = new Scanner(System.in);
//        int favoriteNumber;
//        System.out.println("Please input your favorite number: ");
//        favoriteNumber = sc.nextInt();
//        System.out.println("You entered the number : " + favoriteNumber);
//
//        String userInput;
//        Scanner sc = new Scanner(System.in);
//        String firstWord;
//        String secondWord;
//        String thirdWord;
//        firstWord = "hello";
//        secondWord = "i'm new";
//        thirdWord = "in java";
//        System.out.print("Enter three words : " + firstWord);
//        userInput = sc.nextLine();
//        System.out.println("Enter second " + secondWord);
//        userInput = sc.nextLine();
//        System.out.println("Enter third " + thirdWord);
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//        System.out.println("Enter a sentence ");
//        userInput = sc.nextLine();
//        System.out.println("YOu entered: "  + userInput + "\" <--");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int userInt = scan.nextInt();

        System.out.println("please enter 3 words");
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();

        System.out.println(first + " " + second + " " + third);
        scan.nextLine(); // grabs the last /n character and we can ignore it.

        System.out.println("input a sentence");
        String sentence = scan.nextLine();
        System.out.println(sentence);


//
//
        System.out.println();// give an extra space
        System.out.println("input the length");
        String lengthString = scan.next();
        int length = Integer.parseInt(lengthString);
        System.out.println("length is " + length);

        System.out.println("input the width");
        String widthString = scan.next();
        int width = Integer.parseInt(widthString);
        System.out.println("Width is " + width);

        System.out.println("input the height of the room ");
        String heightString = scan.next();
        double height = Double.parseDouble(heightString);

        double area = width * length;
        System.out.println("Area of the room is " + area);

        double perimeter = 2 * width + 2 * length;
        System.out.println("Perimeter is " + perimeter);

        double volume = width * length * height;
        System.out.println("Volume is " + volume);



//        Scanner userInput = new Scanner(System.in);
//        float wide;
//        System.out.println("Enter wide of the classroom");
//        wide = userInput.nextFloat();
//
//        float length;
//        System.out.println("Enter length of the classroom");
//        length = userInput.nextFloat();
//
//        float area;
//        area = wide * length;
//        System.out.println(area);
//
//        float perimter;
//        perimter = 2 * length + 2 * wide;
//        System.out.println(perimter);


    }
}
