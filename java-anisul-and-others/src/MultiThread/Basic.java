package MultiThread;

public class Basic {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        obj.print();

        // first it calls print() method and prints all the 1's then goes to following line and executes the rest of the codes. Notice that all the threads are run by Main. That's why all the 1's and 2's printed sequentially.
        for (int i = 0; i < 10; i++) {
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class A extends Thread {
    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
