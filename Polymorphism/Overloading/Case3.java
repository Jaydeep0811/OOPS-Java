package Polymorphism.Overloading;
/*
 * Case3:
 * */
public class Case3 {
	public void m1(int... a) {
		System.out.println("var arg Method");
		
	}
	
	public void m1(int a) {
		System.out.println("Int Method");
		
	}
 public static void main(String[] args) {
	Case3 c3=new Case3();
	c3.m1(2);
}
}
