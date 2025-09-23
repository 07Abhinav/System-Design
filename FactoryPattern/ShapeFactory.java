public class ShapeFactory {
    Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Reactangle();
            default:
                return null;
        }
    }
}
