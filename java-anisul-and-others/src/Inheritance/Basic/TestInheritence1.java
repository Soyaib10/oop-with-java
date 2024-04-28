package Inheritance.Basic;

public class TestInheritence1 {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.name = "hello";
        obj.age = 23;
        obj.qualification = "Lecturer";
        obj.display1();

        Teacher obj2 = new Teacher();
        obj2.name = "hello2";
        obj2.age = 223;
        obj2.qualification = "Lecturer2";

        obj2.display1();
    }
}
