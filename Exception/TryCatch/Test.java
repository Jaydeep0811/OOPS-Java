package Exception.TryCatch;
/*
 * try is block in java which is containing statement which will give an exception
 * catch  is a key in java which is use with try block for handle a exception of a code which  contain try block 
 * */
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
		System.out.println("Hii");

	}

}
