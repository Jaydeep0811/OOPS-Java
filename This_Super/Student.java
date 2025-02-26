package This_Super;

public class Student {
  public Student(int x) {
	  
	 System.out.println("int"); 
  }
  public Student(String x) {
	  this(10);
		 System.out.println("string"); 
	  }
  public Student(float x,char c) {
	  this("Abhay");
		 System.out.println("float & char"); 
	  }
  public Student() {
	  this(1.1f,'A');
	  
		 System.out.println("Constructor"); 
	  }

}
