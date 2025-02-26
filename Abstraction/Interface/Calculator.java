package Abstraction.Interface;
/**
 * 
 * @param x
 * @param y
 * by default interface have public abstarct . we don't have wrritten key word abstarct and modifier to meth
 */
 
public interface Calculator {

	 public  int addition(int x, int y); 
	  abstract int substractio(int x, int y);
	 public abstract int multiplication(int x, int y);
	  int division(int x, int y);

}
