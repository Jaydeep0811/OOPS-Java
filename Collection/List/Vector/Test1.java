package Collection.List.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		
//		Enumeration : Iterator by legacy class
		System.out.println("Enumeration : Iterator by legacy class");
		Enumeration<Integer>  emitr= v.elements();
		
		while (emitr.hasMoreElements()) {
			Integer i = emitr.nextElement();
			System.out.println(i);
			
		}
		
//		Iterator 
		System.out.println("Iterator");
		Iterator<Integer> itr= v.iterator();
		
		while(itr.hasNext()) {
			Integer i =itr.next();
			System.out.println(i);
		}
		
		
//		ListIterator 
		System.out.println("ListIterator");
		ListIterator<Integer> litr= v.listIterator();
		
		while(litr.hasNext()) {
			Integer i =litr.next();
			System.out.println(i);
		}
	
	
//	get() by for loop
	System.out.println("for loop"); 
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	
//	enhance  for loop
	System.out.println("enhance for loop"); 
	for(int i:v) {
		System.out.println(i);
	}
	
	
//	forEach iterable interface method
	System.out.println("forEach iterable interface method"); 
	v.forEach(System.out::println);
	
	}

}
