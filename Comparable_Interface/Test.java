package Comparable_Interface;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeSet<Student> tree= new TreeSet<Student>();
   
    tree.add(new Student(101,"Jay",12000));
    tree.add(new Student(107,"karan",15000));
    tree.add(new Student(108,"Vijay",120000));
    tree.add(new Student(112,"Pranay",5000));
    tree.forEach(a->{
    	System.out.println(a.getId() + " " + a.getName() +" " + a.getMarks());
    });
	}

}
