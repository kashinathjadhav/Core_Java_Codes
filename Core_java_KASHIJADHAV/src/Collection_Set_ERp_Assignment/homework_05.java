package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//6) Write a program to add all the elements of a specified tree set to another treeset.
public class homework_05 {

	public static void main(String[] args) 
	{
TreeSet tr=new TreeSet();
		
		tr.add("green");
		tr.add("pink");
		tr.add("yelllow");
		tr.add("green");
		
		System.out.println(tr);
		
		TreeSet tr1=new TreeSet(tr);
		
		System.out.println(tr1);
		
	}

}
