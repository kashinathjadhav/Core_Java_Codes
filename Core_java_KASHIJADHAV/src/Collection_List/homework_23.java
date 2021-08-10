package Collection_List;

import java.util.LinkedList;

//23) Write a program to retrieve but does not remove, the last element of a linkedlist.
public class homework_23 {

	public static void main(String[] args) {
		
		LinkedList lr=new LinkedList();
		
		lr.add("kashi");
		lr.add("jadhav");
		lr.add("vijay");
		
		System.out.println(lr);
		
		System.out.println(lr.getLast());

	}

}
