package Inheritance.Super;

public class Variable {
    int x = 10;
}

class VariableInherites extends Variable {
    int x = 5;

//    This will print 5 as output
//   void display() {
//        System.out.println(x);
//    }

    void display() {
        System.out.println(super.x);
    }
}

class TestVariable {
    public static void main(String[] args) {
        VariableInherites obj = new VariableInherites();
        obj.display();
    }
}
