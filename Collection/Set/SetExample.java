package Collection.Set;

import java.util.HashSet;
import java.util.Set;

/*
 * Set are not duplicate allowed 
 */
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set= new HashSet();
		
		set.add("Hii");
		set.add(12);
		set.add("");
		set.add(null);
		set.add("Hii");
		set.add(null);
		set.add(true);
		set.add(12);
		System.out.println(set.add(12));

	}

}
