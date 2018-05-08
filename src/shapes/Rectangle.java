package shapes;

public class Rectangle {


    protected int width;
    protected int length;
    protected String type;

    public Rectangle(){};

    public Rectangle (int width, int length){
        this.width = width;
        this.length = length;
        type = "rectangle";
    }

    public String getType(){
        return type;
    }

    public int getArea(){
        return width * length;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public String toString(){
        return "A rectangle with length of " + getLength() + " and width of " + getWidth() +
                "has an area of: " + getArea() + "and a perimeter of " + getPerimeter();
    }

}
