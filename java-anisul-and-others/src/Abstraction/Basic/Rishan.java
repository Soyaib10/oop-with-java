package Abstraction.Basic;

public class Rishan extends MobileUser {
    void hello() {
        System.out.println("Rishan is calling");
    }

    @Override
    void sendMessage() {
        System.out.println("I am Rishan");
    }
}
