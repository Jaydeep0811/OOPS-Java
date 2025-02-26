package Abstraction.Interface;

public class CalculatorImpl implements Calculator{

	@Override
	public int addition(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int substractio(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiplication(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int division(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
