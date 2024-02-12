public class Human {
    // instance variable -> inside a class but outside the function
    String name;
    int age;
    double hight;

    // constructors
    Human(String name) {
        this.name = name;
    }

    Human(String name, int age, double hight) {
        this(name);
        this.age = age;
        this.hight = hight;
    }

    // method
    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(hight);
        System.out.println();
    }
}
