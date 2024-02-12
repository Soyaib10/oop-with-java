public class Human {
    // instance variable -> inside a class but outside the function
    String name;
    int age;
    double hight;

    // constructors
    Human() {
        // default constructor
    }

    Human(int x) {
        age = x;
    }


    // methods
    void eat() {
        System.out.println("Eating...");
    }
    void sleep() {
        System.out.println("Sleeping...");
    }
    void walk() {
        System.out.println("Walking...");
    }
}
