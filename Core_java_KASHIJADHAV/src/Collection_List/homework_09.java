package Collection_List;

import java.util.LinkedList;

//9) Write a program to insert elements into the linked list at the first and lastposition
public class homework_09 
{

	public static void main(String[] args) 
	{
		LinkedList lr=new LinkedList();
		
		lr.add("shubhya");
		lr.add("adi");
		lr.add("shyam");
		lr.add("jk");
		
		System.out.println(lr);
		lr.addFirst("ajuuu");
		
		System.out.println(lr);
		lr.addLast("vijuu");
		System.out.println(lr);

	}

}
