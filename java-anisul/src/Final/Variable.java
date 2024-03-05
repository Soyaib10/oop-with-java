package Final;

public class Variable {
    final int a = 50; // normal
    final int b; // blank final
    static final int c = 50; // static final
    static final int d; // blank static final

    Variable(int b) {
        this.b = b;
    }

    static {
        d = 10;
    }

    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }

    public static void main(String[] args) {
        Variable obj = new Variable(34);
        obj.display();
    }
}


