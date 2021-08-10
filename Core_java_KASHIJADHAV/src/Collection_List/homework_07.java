package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

//7) Write a program to iterate through all elements in a linked list starting at the
//specified position.
public class homework_07 {

	public static void main(String[] args)
	{
	
		LinkedList lr=new LinkedList();
		lr.add("vijay");
		lr.add("Jadhav");
		lr.add("shubhya");
		lr.add("ksks");
		
		System.out.println(lr);
		
		Iterator ir=lr.iterator();
		int cnt=0;
		while(ir.hasNext())
		{
			if(cnt>=1)
			{
			System.out.println(ir.next());
			}
			else
			{
			ir.next();
			}
			cnt++;
		}
	}

}
