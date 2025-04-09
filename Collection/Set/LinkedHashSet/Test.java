package Collection.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * There is follow insertion order
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hashset= new HashSet();
		hashset.add(10);
		hashset.add(10);
		hashset.add(20);
		hashset.add(60);
		hashset.add(90);
		hashset.add(1);
		
		System.out.println(hashset);
//		Out put will be [1, 20, 10, 90, 60] that is not follow insertion order and   they are stored data as hashcode of element
	}

}
