package Collection_List;

import java.util.LinkedList;

//5) Write a program to append the specified element to the end of a linkedlist
public class homework_05 {

	public static void main(String[] args) 
	{
	
		LinkedList lr=new LinkedList();
		lr.add("vijay");
		lr.add("Jadhav");
		lr.add("shubhya");
		lr.add("ksks");
		
		System.out.println(lr);
		lr.addLast("adiii");
		System.out.println(lr);
	}
	

}
