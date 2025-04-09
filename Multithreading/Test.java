package Multithreading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyThread t= new MyThread();
//		t.start();
//  	by Thread class

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Method Running");
		}
	}

}
