package Collection.Queue.PriorityQueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.*;

/*
 * Queue is interface 
 * it has heterogenious 
 * it follows FIFO
 * not null allowed
 * insertion order not followed
 * sortin asending order
 * duplicate allowed
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue= new PriorityQueue(10);
		queue.add("Ram");
		queue.add("Raj");
		queue.add("Aman");
		queue.add("Ram");
		queue.add("Raj");
		queue.add("Aman");
		
	
		System.out.println(queue);
		
		
		Queue<Integer> number= new PriorityQueue<Integer>(10);
		number.add(10);
		number.add(20);
		number.add(5);
		number.add(10);
		number.add(20);
		number.add(5);
		System.out.println(number);
		
		for(Integer num:number) {
			System.out.println(num);
		}
		
		System.out.println(" Another Ex");
		System.out.println( );
		
		Iterator<Integer> itr= number.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		
		System.out.println(" Another Ex");
		System.out.println( );  
		
		number.forEach(System.out::println);
		
		System.out.println(" Another Ex");
		System.out.println( );  
		
		
		
	}

}
