package Collection_Set_ERp_Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

//17) Write a program to convert a hash set to a List/ArrayList.
public class homework_17 {

	public static void main(String[] args) {
		
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		System.out.println(tr);
		
		ArrayList ar=new ArrayList(tr);
		
		System.out.println(ar);
		
		LinkedList lr=new LinkedList(ar);
		
		System.out.println(lr);
		

	}

}
