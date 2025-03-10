package Abstraction.MarkerInterface;

public class Student implements Cloneable{
	int id;
	String name;

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student s1= new Student();
		Student s2= (Student) s1.clone();
		var name= s2.name="Aboli";
		System.out.println(s1.id=1);
		System.out.println(name);
	}
}
