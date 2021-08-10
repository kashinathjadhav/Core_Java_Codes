package Queue;

import java.util.PriorityQueue;

//4) Write a program to retrieve the first element of the priorityqueue.
public class homework_04 {

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
		System.out.println(pq.peek());

	}

}
