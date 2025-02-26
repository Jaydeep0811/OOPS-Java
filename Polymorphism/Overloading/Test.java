/**
 * 
 */
package Polymorphism.Overloading;

/**
 * main class 
 */
public class Test {
public static void main(String[] args) {
	Calculator c= new Calculator();
		
c.add(10, 10);
c.add(10f, 50f);
c.add(50L, 10L);
c.add(10d,650d);
c.add('a','a');

}
}
