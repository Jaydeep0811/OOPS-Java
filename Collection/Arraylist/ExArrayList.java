package Collection.Arraylist;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ExArrayList {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
       ArrayList<String> ar= new ArrayList<String>();
       
       ar.add("Jay");
       ar.add("Suraj");
       ar.add("Partik");
//      String s= ar.getLast();
       
       ArrayList<String> li= new ArrayList<String>();
       ar.add("Jay");
       ar.add("Suraj");
       ar.add("Partik");
       ar.addAll(li);
       
       
//       ar.remove(1);
//       List<String> ar2= (List) ar.clone();
     

      System.out.println 
      (ar.get(0));
      
      
	}

}
