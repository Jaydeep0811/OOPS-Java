package Multithreading;

public class MultiThreads extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
		m1();
		m2();
		m3();
		m4();
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
	}
}
