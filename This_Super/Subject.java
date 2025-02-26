package This_Super;

public class Subject extends Student{

	public Subject(boolean b) {
		super();
		
		System.out.println("Boolean");
	}
	public Subject(long l) {
		this(true);
		 System.out.println("long"); 
	  }
	
}