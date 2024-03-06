package Abstraction.Basic;

public class TestAbstract {
    public static void main(String[] args) {
        // remember you can't create an object of an abstract class
        MobileUser mu; // reference variable

        mu = new Rrid();
        mu.sendMessage();

        mu = new Rishan();
        mu.hello();
        mu.sendMessage();
    }
}
