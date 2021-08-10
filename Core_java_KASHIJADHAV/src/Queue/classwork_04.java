package Queue;

import java.util.PriorityQueue;

//4) Write a program to insert a given element into a priority queue
public class classwork_04 {

	public static void main(String[] args) 
	{
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("owow");
		pq.add("kwkwkd");
		pq.add("jdwjdj");
		pq.add("kk ");
		pq.add("jwjw");
		
		System.out.println(pq);
		
		pq.add("kskks");
		
		System.out.println(pq);
	}

}
