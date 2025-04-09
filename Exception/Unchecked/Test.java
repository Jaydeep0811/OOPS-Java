package Exception.Unchecked;
/*
 * Unchecked Exception which can handle at runtime 
 * */

public class Test {

	
	public static void main(String[] args) {
		
		try {
			int a = 10;
	        int b = 0;
	        int result = a / b; // Throws ArithmeticException
	        System.out.println(result);
	        
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
	       // Throws NullPointerException
	        try {
				 String str = null;
	        System.out.println(str.length()); 
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	        
	        
	        try {
			String str1 = "abc";
	        int num = Integer.parseInt(str1); // Throws NumberFormatException
	        System.out.println(num);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	        
	        // Throws StringIndexOutOfBoundsException
	        try {
				 String text = "Hello";
	        System.out.println(text.charAt(10));
			} catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	}
}
