package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//14) Write a program to retrieve and remove the first element of a treeset.
public class homework_14 {

	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		System.out.println(tr);
		System.out.println(tr.first());
	    tr.remove(6);
		System.out.println(tr);
	}

}
