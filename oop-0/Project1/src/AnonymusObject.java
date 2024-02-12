public class AnonymusObject {
    public static void main(String[] args) {
        // normal object declaration
        B obj = new B();
        obj.age = 55;
        System.out.println(obj.age);
        obj.f();

        // annonymus object declaration. you can't make any changes to class B() with annonymus function.
        System.out.println(new B().age);
        new B().f();
    }
}

class B {
    int age = 5;
    public void f() {
        System.out.println("This is anonymus function");
    }
}


