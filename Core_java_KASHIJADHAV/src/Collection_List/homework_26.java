package Collection_List;

import java.util.LinkedList;

//26) Write a program to compare two linked lists
public class homework_26 {

	public static void main(String[] args) 
	{
		
		LinkedList lr=new LinkedList();
		lr.add("iwiow");
		lr.add("idid");
		lr.add("jklm");
		lr.add("hdhdh");
		
		LinkedList lr1=new LinkedList();
		lr1.add("iwiow");
		lr1.add("idid");
		lr1.add("jklm");
		lr1.add("hdhdh");
		
		System.out.println(lr.equals(lr1));
	}

}
