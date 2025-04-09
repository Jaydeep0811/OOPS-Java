package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "Priti");
		map.put(102, "Vijay");
		map.put(104, "Ajay");
		map.put(105, "Kiran");
		map.put(106, "ketan");
		
		Set<Integer> mapSet=map.keySet();
	   Iterator<Integer> keys =	mapSet.iterator();
	   while (keys.hasNext()) {
		Integer integer = (Integer) keys.next();
	 String value=	map.get(integer);
	 System.out.println(value);
		
	}
	   
//	   by enhance for loop
	   System.out.println(" ");
	   System.out.println(" by enhance for loop");
	  for(Integer key:mapSet) {
		  String value=	map.get(key);
			 System.out.println(value);
	  }
	   
//	   by  forEach
	   System.out.println(" ");
	   System.out.println(" by forEach");
	   mapSet.forEach(key->{
		   String value=	map.get(key);
			 System.out.println(value);
	   });
	}

}
