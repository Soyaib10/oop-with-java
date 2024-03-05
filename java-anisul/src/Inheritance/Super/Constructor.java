package Inheritance.Super;

public class Constructor {
    Constructor() {
        System.out.println("Inside super constructor");
    }
}

class SubClassConstructor extends Constructor {
    SubClassConstructor() {
        super(); // this is enough to call the super class constructor
        System.out.println("Inside sub constructor");
    }
}

class TestSubClassConstructor {
    public static void main(String[] args) {
        SubClassConstructor obj = new SubClassConstructor();
    }
}
