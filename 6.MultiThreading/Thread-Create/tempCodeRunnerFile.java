        Thread t1 = new Thread(() -> {
            System.err.println("Ramda thread is running: " + Thread.currentThread().getName());
        });
        t1.start();