package Exception.Throw;

/*
 * throw user define exception
 */
public class Even_OddNumber extends Exception{

	String str;
	
	public Even_OddNumber(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}
	
	public void numberIsEvenOrNot(int a) throws Throwable {
		
		if(a%2==0) {
			System.out.println("Number is Even ");
		}else
		{
			throw new Throwable(str);
			
			}
	}
}
