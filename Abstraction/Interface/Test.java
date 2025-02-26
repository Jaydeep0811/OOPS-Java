package Abstraction.Interface;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CalculatorImpl c= new CalculatorImpl();
      System.out.println(c.addition(10,30));
      System.out.println(c.substractio(10,30));
      System.out.println(c.multiplication(10,30));
      System.out.println(c.division(10,30));

	}
}
