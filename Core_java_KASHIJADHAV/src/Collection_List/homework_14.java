package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

//14) Write a program to display the elements and their positions in a linked list.
public class homework_14 {

	public static void main(String[] args) 
	{
		

		LinkedList lr=new LinkedList();
		
		lr.add("shubhya");
		lr.add("adi");
		lr.add("shyam");
		lr.add("jk");
		lr.add("kkk");
		lr.add("ldldk");
		lr.add("kwdopwm");
		lr.add("nwskned");
		lr.add("kwlk");
		lr.add("jk");
		lr.add("adi");
		
		int cnt=0;
		Iterator ir=lr.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next()+"  position: "+cnt);
			cnt++;
		}
		
	}

}
