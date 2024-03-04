package StaticKeyword;

public class Student {
    String name;
    int id;
    static String universityName = "JnU";

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University Name: " + universityName);
        System.out.println();
    }
}

class test {
    public static void main(String[] args) {
        Student obj1 = new Student("Rrid", 301);
        Student obj2 = new Student("Rishan", 006);

        obj1.displayInfo();
        obj2.displayInfo();

        // To access static variable or method you do not need a object. just call it by class name.
        System.out.println(Student.universityName);
    }
}