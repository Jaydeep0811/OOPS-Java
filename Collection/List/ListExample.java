package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
public static void main(String[] args) {
	
	List<Integer> li= new ArrayList<Integer>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	
	// By Iterator
	Iterator<Integer> itr= li.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println();
	
	// By ListIterator
ListIterator<Integer> litr= li.listIterator();
	
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	

System.out.println();

// By get methods

   for(int i=0;i<li.size();i++) {
	   System.out.println(li.get(i));
   }
   
   System.out.println();
//   by for ehance 
   
   for(int i:li) {
	   
	   System.out.println(i);
   }
   System.out.println();
   
//   by forEach loop
   
   li.forEach(System.out::println);
}
}
