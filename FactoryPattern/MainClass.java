public class MainClass {
    public static void main(String[] args) {
        // Create a factory instance
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle object and call its draw method
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Get a Rectangle object and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
