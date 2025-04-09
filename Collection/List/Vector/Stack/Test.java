package Collection.List.Vector.Stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);// Head Element
		
		
		System.out.println("Before peek Method "+ st);
		st.peek();
		System.out.println("Before peek Method "+ st);
		
		System.out.println("Before pop Method "+ st);
		st.pop();
		System.out.println("Before peek Method "+ st);
		
		for(int i=0;i<st.size();i++) {
			
			System.out.println(st.get(i));
		}
	}
}
