package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

//24) Write a program to check if a particular element exists in a linkedlist.
public class homework_24 {

	public static void main(String[] args) 
	{
		LinkedList lr=new LinkedList();
		
		lr.add("kashi");
		lr.add("kakdkd");
		lr.add("abc");
		lr.add("kkk");
		
		String s="ka";
		
		Iterator ir=lr.iterator();
		int cnt=0;
		while(ir.hasNext())
		{
			if(ir.next()==s)
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}

	}

}
