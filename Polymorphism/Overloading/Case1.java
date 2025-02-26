package Polymorphism.Overloading;

/*
 * Overloading Polymorphism
 * Case 1 : 
 * */

public class Case1 {
	
	public void m1(String c) {
		// TODO Auto-generated method stub
    System.out.println("String Method");
	}
	
	public void m1(int x) {
		// TODO Auto-generated method stub
    System.out.println("Int Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case1 t=new Case1();
		t.m1(10);
		t.m1("Suraj");
		t.m1('A');// By Default call to int method 
		}

}
