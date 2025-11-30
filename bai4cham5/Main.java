package bai4cham5;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2.toString());

        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(2.5, "blue", true);
        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1.toString());

        Square square2 = new Square(5.0, "purple", true);
        System.out.println(square2.toString());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
    }
    
}
