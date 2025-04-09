package Multithreading.methods;

class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                Thread.sleep(1000L); // Sleep for 1 second
            } catch (Exception e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        SleepExample t2 = new SleepExample();

        t1.start();
        t2.start();
    }
}