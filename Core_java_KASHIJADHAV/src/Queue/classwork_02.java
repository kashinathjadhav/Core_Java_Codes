package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//2) Write a program to iterate through all elements in priority queue.
public class classwork_02 {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("owow");
		pq.add("kwkwkd");
		pq.add("jdwjdj");
		pq.add("kk ");
		pq.add("jwjw");
		
		Iterator ir=pq.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}
