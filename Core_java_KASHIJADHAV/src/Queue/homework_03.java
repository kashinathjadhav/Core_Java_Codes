package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//3) Write a program to compare two priority queues
public class homework_03 {

	public static void main(String[] args) 
	{
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("owow");
		pq.add("kwkwkd");
		pq.add("jdwjdj");
		pq.add("kk ");
		pq.add("jwjw");
		
		PriorityQueue pqr=new PriorityQueue();
		
		pqr.add("abc");
		pqr.add("owow");
		pqr.add("kwkwkd");
		pqr.add("jdwjdj");
		pqr.add("kk ");
		pqr.add("jwjw");
		
		Iterator ir=pq.iterator();
		Iterator ir1=pqr.iterator();
		int cnt=0;
		
		while(ir.hasNext() || ir1.hasNext())
		{
			
			if(ir.next()!=ir1.next())
			{
				cnt++;
				break;
			}
			ir.next();
			ir1.next();
		}
		
		if(cnt==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

}
