import java.util.Scanner;

public class HighLow {

    // ================= GAME DEVELOPMENT 101 ===================================


    public static int gamePickNumber(){
        return (int) (Math.random() * 100) + 1;
    }

    public static int userPickNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number");
        return input.nextInt();
    }

    public static void main(String[] args) {


        int randomNUmber = gamePickNumber();
        int guess;
        System.out.println(randomNUmber);
        do {
            guess = userPickNumber();
            if (guess < randomNUmber) {
                System.out.println("HIGHER");
            } else if (guess > randomNUmber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS");
            }
        } while (guess != randomNUmber);
    }

    }
