package Multithreading.methods;

class JoinExample extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is starting...");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " has finished.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public static void main(String[] args) {
    	JoinExample t1 = new JoinExample();
        t1.start();

        try {
            Thread.sleep(2000);
            t1.interrupt(); // Interrupting the sleeping thread
            t1.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread execution completed.");
    }
}
