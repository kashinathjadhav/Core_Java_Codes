package Queue;

import java.util.PriorityQueue;

//5) Write a program to convert a priority queue to an array containing all of the elements of the
//queue
public class homework_05 {

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
		
		Object a[]=pq.toArray();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
