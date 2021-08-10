package Collection_Set_ERp_Assignment;

import java.util.TreeSet;
//pending
//12) Write a program to get the element in a tree set which is greater than or equal to the given
//element.
public class homework_12 {

	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		
		System.out.println( tr.tailSet(7));
       
	}

}
