package shapes;

import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;

public class ShapesTest {


    public static void main(String[] args) {
        System.out.println("These are the shapes to measure");

        Measurable myShape;

        Quadrilateral shape3 = new Rectangle(3, 5 );


            myShape = new Rectangle( 20, 30);

            myShape = new Square(20);

            Measurable shape1 = new Rectangle(5, 3);
            Quadrilateral shape2 = new Square(4);


            // THESE WORK WHEN HAVING THE GETTERS OF WIDTH, LENGTH, PERIMETER AND AREA IN QUADRILATERAL
//        System.out.println("Shape number 1 with length of " + shape3.getLength() + " and a width of " + shape3.getWidth() +
//                " has a perimeter of " + shape3.getPerimeter());
//
//        System.out.println("Shape number 2 with length of " + shape2.getLength());

        System.out.println("Shape number 3 with length of " + shape3.length);
        System.out.println("Shape number 3 with width of " + shape3.width);


        HashMap<String, Measurable> quadrilaterals = new HashMap<>();
        quadrilaterals.put("box1", new Rectangle(3,5));
        quadrilaterals.put("box2", new Square(4));
        quadrilaterals.put("box3", new Square(12));

        for(Map.Entry<String, Measurable> entry: quadrilaterals.entrySet()){
            System.out.println("key =" + entry.getKey() + ", Value = ");
        }

        ArrayList<String> compiledLanguages = new ArrayList<>();
        compiledLanguages.add("Java");
        compiledLanguages.add("C++");
        compiledLanguages.add("C#");
        compiledLanguages.add("swift");

        ArrayList<String> interpretedLanguages = new ArrayList<>();
        interpretedLanguages.add("Javascript");
        interpretedLanguages.add("Ruby");
        interpretedLanguages.add("Python");
        interpretedLanguages.add("Clojure");
        interpretedLanguages.add("Scheme");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");


        if (interpretedLanguages.contains("Lisp")) {
            int count = 0;
            for(String language : interpretedLanguages){
                if(language.equalsIgnoreCase("lisp")){
                    count ++;
                }
            }
            System.out.println("LISP shoes up " + count + "times");
        }





        HashMap< String, ArrayList> languages = new HashMap<>();
        languages.put("compiled", compiledLanguages);
        languages.put("Interpreted", interpretedLanguages);

        //how do i access javascript

//        String output = (String) languages.get("interpreted").get(0);
//
//        System.out.println(output);

        String output = (String) languages.get("interpreted").get(interpretedLanguages.indexOf("Javascript"));
        System.out.println(output);





    }

}











// =============== FIRST EXERCISE OF SHAPE TEST =============

//public class ShapesTest {
//
//    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println("The area for box1 is: " + box1.getArea() + " and the perimeter is: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("The area for box2 is " + box2.getArea() + " and the perimeter is: " + box2.getPerimeter());
//
//        }
//
//    }
//
//
//
