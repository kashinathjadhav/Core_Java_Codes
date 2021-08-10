package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//8) Write a program to get the first and last elements in a tree set.
public class homework_08 {

	public static void main(String[] args) 
	{
		

		TreeSet tr=new TreeSet();
		tr.add("pink");
		tr.add("green");
		tr.add("pink");
		tr.add("yelllow");
		System.out.println(tr.first());
		System.out.println(tr.last());
			}

}
