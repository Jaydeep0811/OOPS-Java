package Polymorphism.overriding;

public class Test {
   public static void main(String[] args) {
	Parent p= new Parent();
	Child c= new Child();
	Parent p1= new Child();//Reference class and constructor class also 
	
	
	p.property();
	p.marry();
	
	c.property();
	c.marry();
	
	p1.property();
	p1.marry();

	System.out.println(""+p.equals(p1) + p.getClass().getName());
	
	}
}
