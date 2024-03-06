package Abstraction.ProblemOnAbstruction;

public class TestShape {
    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(10, 24);
        shape.area();

        shape = new Triangle(20, 10);
        shape.area();

        shape = new Circle( 10);
        shape.area();
    }
}
