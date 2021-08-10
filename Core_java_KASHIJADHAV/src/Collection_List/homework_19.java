package Collection_List;

import java.util.LinkedList;



//19) Write a program to join two linked lists.
public class homework_19 {

	public static void main(String[] args) {
		
		LinkedList lr=new LinkedList();
		
		lr.add("abc");
		lr.add("akshaya");
		lr.add("vijau");
		
		LinkedList lr1=new LinkedList();
		lr1.add("jadhav");
		lr1.add("vijay");
		lr1.add("pqr");
		
		lr1.add(lr);
		
		System.out.println(lr1);
		
		
	

	}

}
