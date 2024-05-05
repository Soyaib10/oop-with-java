package SubSuperMemoryInheritence;

public class A {
    public int a = 100;

    void print() {
        System.out.println(a);
    }
}

class B extends A {
    int b = 100;
}

class Test {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.a); // use any property of A
        // System.out.println(obj.b); can't use any propery of B
    }
}
