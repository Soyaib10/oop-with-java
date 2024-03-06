package Polymorphism.OverRiding;

public class TestOverRiding {
    public static void main(String[] args) {
        // dynamic method dispatch
        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();
    }
}
