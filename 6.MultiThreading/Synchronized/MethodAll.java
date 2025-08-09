
class Counter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class MethodAll {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
            System.err.println("Thread 1 counter:" + counter.getCount());
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
            System.err.println("Thread 2 counter: " + counter.getCount());
        });

        t1.start(); // Start the first thread
        t2.start(); // Start the second Thread
    }
}
