/**
 * 
 */
package Polymorphism.Overloading;

/**
 * Overloading Example 
 * 
 */
public class Calculator {
	public void add(int x,int y) {
		// TODO Auto-generated method stub
  System.out.println("Integer Addition :"+(x+y));
	}
	
	public void add(float x,float y) {
		// TODO Auto-generated method stub
  System.out.println("Float Addition :"+( x+y));
	}
	public void add(long x,long y) {
		// TODO Auto-generated method stub
  System.out.println("Long  Addition :"+(x+y));
	}
	public void add(double x,double y) {
		// TODO Auto-generated method stub
  System.out.println("Double Addition :" + (x+y));
	}
	public void add(short x,short y) {
		// TODO Auto-generated method stub
  System.out.println("Short Addition :" +(x+y));
	}
	
}
