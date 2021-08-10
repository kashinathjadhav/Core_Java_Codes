package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//7) Write a program to create a reverse order view of the elements contained in a given tree set.
public class homework_07 
{

	public static void main(String[] args) 
	{
TreeSet tr=new TreeSet();
		
		tr.add("green");
		tr.add("pink");
		tr.add("yelllow");
		
		
		System.out.println(tr);
		
		TreeSet tr1=new TreeSet(tr);
		
		System.out.println(tr1);
		System.out.println(tr.descendingSet());
	}

}
