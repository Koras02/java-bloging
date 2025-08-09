
class Counter {

    private int count = 0;

    public void increment() {
        synchronized (this) { // 특정 객체 락
            count++;
        }
    }
}

public class Block {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        t1.start(); // Start the first thread
        t2.start();
    }
}
