package Advanced.Design_Patterns;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeType) {
        switch (shapeType.toUpperCase()) {
            case "CIRCLE" -> {
                return new Circle();
            }
            case "SQUARE" -> {
                return new Square();
            }
            default -> {
                return null;
            }
        }
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("square");
        square.draw();

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();
    }
}
