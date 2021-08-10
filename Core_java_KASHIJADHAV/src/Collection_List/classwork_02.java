package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

//2) Write a program to iterate through all elements in a array list
public class classwork_02 {

	public static void main(String[] args) 
	{
		
		ArrayList ar=new ArrayList();
		ar.add(12);
		
		ArrayList ab=new ArrayList();
		
		ab.add(11);
		
		Iterator ir=ar.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
			
		}
		
		
	}

}
