package Map.Dictonary.Hashtable;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
/*
 * default size 11 
 * heterogenious data allowed
 * Data inserted  in jar 
 * top to bottom retrive and add by 11%key=reminder reminder is a index of jar
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String>  hashtable=new  Hashtable<Integer, String>();
		
		hashtable.put(101, "Ajay");
		hashtable.put(105, "Seema");
		hashtable.put(106, "Vijay");
		hashtable.put(103, "Karan");
		
		hashtable.put(107, "Ketan");
        Set<Integer> setmap= hashtable.keySet();
        
        setmap.forEach(ele->{
        	System.out.println(hashtable.get(ele));
        	
        });
        

	}

}
