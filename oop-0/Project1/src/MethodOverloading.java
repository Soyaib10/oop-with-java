public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.print(1, 3.2);
    }
}

class A {
    void print(int x) {
        System.out.println("method 1");
        System.out.println(x);
    }

    void print(double x) {
        System.out.println("method 2");
        System.out.println(x);
    }

    void print(int x, double y) {
        System.out.println("method 3");
        System.out.println("int: " + x + " double: " + y);
    }
}

// This is called polymorphism as the same function does different works when
// changing parameters. But here you can't have different return type. All the
// methods should have same return type.