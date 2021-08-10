package Collection_List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//8) Write a program to iterate a linked list in reverse order..
public class homework_08 {

	public static void main(String[] args) 
	{
		LinkedList lr=new LinkedList();
		
		lr.add("shubhi");
		lr.add("jadhav");
		lr.add("shubhya");
		lr.add("viju");
		
		System.out.println(lr);
		
		Object ob[]=lr.toArray();
		for (int i = ob.length-1; i>=0; i--)
		{
			System.out.println(ob[i]);
		}
		
		
		
                
	}

}
