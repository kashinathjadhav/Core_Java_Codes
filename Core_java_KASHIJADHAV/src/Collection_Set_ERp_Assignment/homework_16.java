package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//16) Write a program to remove a given element from a tree set
public class homework_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TreeSet tr=new TreeSet();
		tr.add(11);
		tr.add(12);
		tr.add(9);
		tr.add(6);
		tr.add(7);
		System.out.println(tr);
		
	    tr.remove(12);
		System.out.println(tr);

	}

}
