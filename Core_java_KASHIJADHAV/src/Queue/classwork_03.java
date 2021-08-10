package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//3) Write a program to add all the elements of a priority queue to another priorityqueue
public class classwork_03 {

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("owow");
		pq.add("kwkwkd");
		pq.add("jdwjdj");
		pq.add("kk ");
		pq.add("jwjw");
		
		PriorityQueue pq1=new PriorityQueue(pq);
		
		System.out.println(pq1);
		
		
		

	}

}
