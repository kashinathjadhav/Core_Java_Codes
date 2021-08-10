package Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;

//25) Write a program to convert a linked list to array list.
public class homework_25 {

	public static void main(String[] args) {
		
		LinkedList lr=new LinkedList();
		
		lr.add("ksks");
		lr.add("kwek");
		lr.add("olewmo");
		
		ArrayList ar=new ArrayList(lr);
		System.out.println(ar);

	}

}
