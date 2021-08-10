package Queue;
//2) Write a program to count the number of elements in a priority queue.

import java.util.Iterator;
import java.util.PriorityQueue;

public class homework_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("owow");
		pq.add("kwkwkd");
		pq.add("jdwjdj");
		pq.add("kk ");
		pq.add("jwjw");
		int cnt=0;
		
		//System.out.println(pq.size());
		Iterator ir=pq.iterator();
		while(ir.hasNext())
		{
			cnt++;
			ir.next();
		}
		System.out.println(cnt);

	}

}
