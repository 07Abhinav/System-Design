package SolidPrinciple;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double length=10;
    private double width=5;

    @Override
    public double area() {
        return length*width;
    }
}

class Triangle extends Shape {
    private double base=10;
    private double height=5;

    @Override
    public double area() {
        return 0.5*base*height;
    }
}

public class OpenClosed {
    public static void main(String []args){
        Shape rectangle = new Rectangle();
        System.out.println("Area of Rectangle: " + rectangle.area());

        Shape triangle = new Triangle();
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
