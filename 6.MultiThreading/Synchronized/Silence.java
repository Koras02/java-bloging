
class Counter {

    private static int count = 0;

    public static synchronized void increment() {
        count++; // Static synchronized method to ensure the count is increment at the class level
    }

}

public class Silence {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        t1.start(); // Start the first thread
    }
}
