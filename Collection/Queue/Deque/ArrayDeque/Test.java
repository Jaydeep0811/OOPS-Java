package Collection.Queue.Deque.ArrayDeque;

import java.util.*;
/*
 * Deque is interface 
 * it has homogenouis 
 * it follows FIFO
 * not null allowed
 * insertion order not followed
 * sortin asending order
 * duplicate allowed
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque deque= new ArrayDeque();
		
		deque.add("Hii");
		deque.add(new Object());
		deque.add(12);
		
		deque.addFirst("rohan");
		
		System.out.println(deque);
		deque.addLast(105);
		
		deque.removeLast();
		System.out.println(deque);
		

	}

}
