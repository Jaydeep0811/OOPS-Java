package Polymorphism.Overloading;
/*
 * Case 2:
 * */
public class Case2 {

	public void m1(Object o) {
		// TODO Auto-generated method stub
    System.out.println("Object Method");
	}
	
	public void m1(String s) {
		// TODO Auto-generated method stub
    System.out.println("String Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case2 t=new Case2();
		t.m1(null);//null value of a method resolution did by default child class of parent first 
		t.m1((Object)null);//
		}

}


