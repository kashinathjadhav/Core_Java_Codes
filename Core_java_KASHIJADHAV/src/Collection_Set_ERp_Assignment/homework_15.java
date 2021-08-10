package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//15) Write a program to retrieve and remove the last element of a tree set.
public class homework_15 {

	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		System.out.println(tr);
		System.out.println(tr.last());
	    tr.remove(12);
		System.out.println(tr);

		
	}

}
