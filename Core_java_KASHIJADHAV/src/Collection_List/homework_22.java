package Collection_List;

import java.util.LinkedList;

//22) Write a program to retrieve but does not remove, the first element of a linkedList
public class homework_22 {

	public static void main(String[] args) 
	{
	
		LinkedList lr=new LinkedList();
		
		lr.add("askhya");
		lr.add("rushya");
		lr.add("vijay");
		lr.add("diip");
		
		System.out.println(lr);
		System.out.println(lr.getFirst());
	}

}
