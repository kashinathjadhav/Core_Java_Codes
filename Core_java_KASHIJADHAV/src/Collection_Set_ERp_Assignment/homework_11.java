package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//11) Write a program to find the numbers less than 7 in a treeset.
public class homework_11 {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(5);
		
		System.out.println(tr.headSet(7));
	}

}
