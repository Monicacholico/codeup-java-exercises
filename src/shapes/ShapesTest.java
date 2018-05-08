package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("The area for box1 is: " + box1.getArea() + " and the perimeter is: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);

        System.out.println("The area for box2 is " + box2.getArea() + " and the perimeter is: " + box2.getPerimeter());

        }

    }



