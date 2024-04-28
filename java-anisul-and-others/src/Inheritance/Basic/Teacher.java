package Inheritance.Basic;

public class Teacher extends Person {
    String qualification;

    void display1() {
        display();
        System.out.println("Qualification: " + qualification);
    }
}
