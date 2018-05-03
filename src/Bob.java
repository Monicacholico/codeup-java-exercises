import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useDelimiter("/n");

        System.out.println("Talk to Bob!");
        String message = input.next();
        String bobSays;

        boolean isQuestion = message.endsWith("?");
        boolean isYelling = message.equals(message.toUpperCase());
        boolean isEmpty = message.trim().equals("");

        if(isQuestion){
            bobSays = "Sure";
        } else if (isYelling) {
            bobSays = "Whoa, chill out!";
        } else if (isEmpty){
            bobSays = "Fine. Be that way";
        } else{
            bobSays = "whatever.";
        }

        System.out.println(bobSays);
    }
}
