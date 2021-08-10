package Collection_List;

import java.util.LinkedList;

//21) Write a program to remove and return the first element of a linkedlist.
public class homework_21 {

	public static void main(String[] args) {
		
		LinkedList lr=new LinkedList();
		
		lr.add("shubhya");
		lr.add("ajay");
		lr.add("vijay");
		lr.add("prem");
		
		System.out.println(lr);
		
		System.out.println(lr.getFirst());
	    lr.removeFirst();
	    
	    System.out.println(lr);
	    

	}

}
