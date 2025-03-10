package Exception.TryCatch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=10/0;
		} catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
//			getMessage() is Throwable class method
		}

	}

}
