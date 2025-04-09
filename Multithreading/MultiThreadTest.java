package Multithreading;

public class MultiThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MultiThreads mt= new MultiThreads();
    mt.start();
    
    mt.m1();
    mt.m2();
    mt.m3();
    mt.m4();
	}

}
