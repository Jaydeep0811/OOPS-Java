package Polymorphism.overriding;

public class B extends A{

	
	int p=20;
	int z=10;
	
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1==B override");
	}
	
	public  void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3==B");

	}
}
