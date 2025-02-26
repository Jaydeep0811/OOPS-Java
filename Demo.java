import java.util.Scanner;

public class Demo {

	
	public int Addition(int a, int b ) {
		
		return a+b;
	}
//	polymorphisum 
	public int Addition(int a, int b ,int c) {
		
		return ((a+b)+c);
	}
	
		public static void main(String[] args) {
			System.out.println("Hello");
			Demo d=new Demo();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number 2 number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter Number 3 number");
			int c=sc.nextInt();
			int h=sc.nextInt();
			int e=sc.nextInt();
			System.out.println("This is Two number of Addition :"	+	d.Addition(a,b));
			System.out.println("This is Three number of Addition :"	+d.Addition(h,e,c));
			
			}
}
