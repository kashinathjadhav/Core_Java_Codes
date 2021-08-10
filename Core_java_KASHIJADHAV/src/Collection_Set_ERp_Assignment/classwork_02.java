package Collection_Set_ERp_Assignment;

import java.util.HashSet;
import java.util.Iterator;

//2) Write a program to iterate through all elements in a hashlist.
public class classwork_02 {

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add("kksks");
		hs.add("jkkk");
		hs.add("djd");
		hs.add("jdjdj");
		
		Iterator ir=hs.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
