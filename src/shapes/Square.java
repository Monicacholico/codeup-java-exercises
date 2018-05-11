package shapes;

public class Square extends Quadrilateral{

public Square(double side){
    super(side, side);
}

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}





























// =========== FIRST EXERCISE WITH SQUARE ================


//public class Square extends Rectangle{
//
//    protected int side;
//
//    public Square (int side) {
//        super(side, side);
//        this.side = side;
//        type = "square";
//    }
//
//    public int getArea(){
//        return side ^ 2;
//    }
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//
//
//}
