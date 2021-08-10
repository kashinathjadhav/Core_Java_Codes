package Queue;

import java.util.PriorityQueue;

//1) Write a program to remove all the elements from a priorityqueue.
public class homework_01 {

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
		
		pq.removeAll(pq);
		
		System.out.println(pq);
	}

}
