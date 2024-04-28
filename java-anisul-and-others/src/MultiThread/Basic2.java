package MultiThread;

public class Basic2 {
    public static void main(String[] args) throws InterruptedException {
        B obj = new B();
        obj.start(); // a different thread say 'T1 thread' starts. 'obj.run()' would cause the 'Main thread' to go and run the run() function. That way no additional thread would be created.

        // first it calls start() method run by T1 thread. Then it goes down and execute the following lines. After each printing it pauses for .5 second and this thread obviously run by Main thread.

        // by that time, another thread that started as T1 thread gets executed in parallel way. This prints 1 and get paused by .5 seconds. This process continues until the loop stops for both thread.
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

class B extends Thread { // creates a thread
    public void run() {
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
