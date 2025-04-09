package Collection.Set.HashSet;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hashset= new LinkedHashSet<Integer>();
		hashset.add(10);
		hashset.add(10);
		hashset.add(20);
		hashset.add(60);
		hashset.add(90);
		hashset.add(1);
		
		System.out.println(hashset);
//	Output will be [10, 20, 60, 90, 1] insertion order is follow
	}

}
