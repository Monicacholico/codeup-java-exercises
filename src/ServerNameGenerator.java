import java.util.Random;

public class ServerNameGenerator {


    public static String[] adjectives = {"strong", "interesting", "beautiful", "demanding", "spectacular", "artistic", "athletic","inspirational", "strict","classic"};
    public static String[] nouns = {"ballet", "ballerina", "art", "dance", "tutu", "performance", "recital", "pointe shoes", "scenario", "principal"};

    public static Random random = new Random();

    public static String randomAdj(String[] comoEsElBallet){
    int index = random.nextInt(adjectives.length);
    return comoEsElBallet[index];
    }

    public static String randomNoun(String [] Ballet){
        int index = random.nextInt(nouns.length);
        return Ballet[index];
    }


    public static void main(String[] args) {


        System.out.println("Here is your server name : \n" + randomAdj( adjectives) + " - "  + randomNoun(nouns));



    }


}






















/* =============== Luis class on Arrays ==============

import java.util.Arrays;

public class ArraysExamples {
    public static void main (String [] args) {

        double[] numbers; // variable declaration
        numbers = new double[7]; // instantiation

        boolean [] booleans = new boolean[5];
        String[] strings = new String[10];
        Bob[] bobs = new Bob[10];

        System.out.println(Arrays.toString(strings));
        Arrays.fill(strings, val: "");
        System.out.println(Arrays.toString(strings));

        // by enumeration

        String beatles [] = {"John", "Paul", "Ringo", "George"};


        Arrays.sort(beatles); // changes the original array, elements are re-indexed
        System.out.println(Arrays.toString(beatles));



        int found = Arrays.binarySearch(beatles, key: "John");
        System.out.println("John is in the index " + found);

        String moreBeatles[] = Arrays.copyOf(beatles, newLength: beatles.length + 1);
        System.out.println(Arrays.toString(moreBeatles));

        String lessBeatles [] = Arrays.copyOf(beatles, newLength: beatles.length -1);
        System.out.println(Arrays.toString(lessBeatles));


        boolean [] withValues = { true, false, true, false};
        Bob moreBobs[] = {new Bob(), new Bob(), new Bob() };
        Circle circles[] = {new Circle(radius: 4), new Circle(radius: 20), new Circle(radius: 4.5)};



        System.out.println(Math.round(circles[1].getArea()));
        System.out.println(beatles[2]);
        System.out.println((int) circles[2].getCircumference());

        System.out.println(circles.length);

        for (int i = 0; i < beatles.length; i++){
        System.out.println(beatles[i]);
        }

        // enhanced for loop

        for(String beatle: beatles) {
        System.out.println(beatle);
        }

        for(int i = 0; i < circles.length; i++){
        System.out.println ( circles[i].getArea());
        System.out.println (circles[i].getCircumference());
        }

        for(Circle circle: circles){
        System.out.println(circle.getArea());
        System.out.println("The area of the circle with radius %f is %f", circle.getRadius(), circle.getArea());
        System.out.println(circle.getCircumference());
        }



        numbers [0] = 6; // in Java arrays do not have methods

        Arrays

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(bobs));
        System.out.println(Arrays.toString(beatles));
        System.out.println(Arrays.toString(withValues));

        System.out.println(numbers);
        // numbers [7] = 8; // error!

    }
}


 */