package Collection_Set_ERp_Assignment;

import java.util.TreeSet;
//pending
//13) Write a program to get the element in a tree set which is less than or equal to thegiven
//element.
public class homework_13 {

	public static void main(String[] args) {
		
		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		
		System.out.println(tr.headSet(7));

	}

}
