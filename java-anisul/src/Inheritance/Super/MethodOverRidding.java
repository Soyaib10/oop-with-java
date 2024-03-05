package Inheritance.Super;

public class MethodOverRidding {
    void display() {
        System.out.println("Inside super class");
    }
}

class SubClass extends MethodOverRidding{
    void display() {
        super.display();
        System.out.println("Inside subclass");
    }
}

class Test {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
