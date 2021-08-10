package Collection_Set_ERp_Assignment;

import java.util.TreeSet;

//) Write a program to clone a tree set list to another tree set
public class homework_09 
{

	public static void main(String[] args) 
	{
	

		TreeSet tr=new TreeSet();
		tr.add("pink");
		tr.add("green");
		tr.add("pink");
		tr.add("yelllow");
		
		TreeSet tr1=(TreeSet) tr.clone();
		
		System.out.println(tr1);

	}

}
