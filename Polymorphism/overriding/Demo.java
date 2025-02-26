package Polymorphism.overriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a= new B();
		
		//Rule 2 VRR Variable Running Rule 
	 System.out.println(a.p);
	 System.out.println(a.q);
	// System.out.println(a.z); loss coupling was not allow to access child class variable and method 

	 
//	 Rule 3 MRR Method Running Rule 
      a.m1();
      a.m2();
      //a.m3();loss coupling was not allow to access child class variable and method  
	}

}
