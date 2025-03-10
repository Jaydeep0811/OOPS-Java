package Exception.Checked;

public class Test {
	

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Test t= new Test();
		
		Object ob= Class.forName("Exception.Checked");
		String s=ob.getClass().getName();
		System.out.println(s);
		
	}
}
