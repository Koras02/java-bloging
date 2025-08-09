
class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable task is running: " + Thread.currentThread().getName());
    }
}

public class MyTaskExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}
