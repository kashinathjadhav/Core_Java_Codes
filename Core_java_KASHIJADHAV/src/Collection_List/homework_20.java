package Collection_List;

import java.util.LinkedList;

//20) Write a program to clone an linked list to another linkedlist.
public class homework_20 {

	public static void main(String[] args) 
	{
	
		LinkedList lr=new LinkedList();
		
		lr.add("jadhav");
		lr.add("abcd");
		lr.add("jk");
		
		LinkedList l2=(LinkedList) lr.clone();
		
		System.out.println(l2);

	}

}
