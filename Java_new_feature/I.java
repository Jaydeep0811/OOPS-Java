package Java_new_feature;

public interface I {

	void m1();
	void m2();
	void m3();
	
	public static void m4() {
		System.out.println("M4--Interface");
	}
	
	public default void m5() {
		System.out.println("Default Implementation");
		
	}

}
