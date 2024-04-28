package MultiThread;

public class Runnable {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.start(); you can't do this because Runnable does not have a start() function.

        Thread t1 = new Thread(obj, "Thread1");
        t1.start(); // starts a new thread
        System.out.println("Inside the main method: " + Thread.currentThread().getName());
    }
}

class MyClass extends AnotherClass implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Inside the run method: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class AnotherClass {

}
