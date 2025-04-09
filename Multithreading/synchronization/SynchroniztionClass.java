package Multithreading.synchronization;

class BankAccount {
    int balance = 1000;

    synchronized void  withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Not enough balance!");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class SynchroniztionClass {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("Customer 1");
        c2.setName("Customer 2");

        c1.start();
        c2.start();
    }
}