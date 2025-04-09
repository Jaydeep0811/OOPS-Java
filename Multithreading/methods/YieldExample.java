package Multithreading.methods;

class YieldExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            Thread.yield(); // Hinting scheduler to allow other threads
        }
    }

    public static void main(String[] args) {
        YieldExample t1 = new YieldExample();
        YieldExample t2 = new YieldExample();

        t1.start();
        t2.start();
    }
}
