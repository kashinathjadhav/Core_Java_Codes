package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

//6) Write a program to iterate through all elements in a linkedlist.
public class homework_06 
{

	public static void main(String[] args) 
	{
		
		LinkedList lr=new LinkedList();
		lr.add("vijay");
		lr.add("Jadhav");
		lr.add("shubhya");
		lr.add("ksks");
		
		Iterator ir=lr.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
			
	}

}
