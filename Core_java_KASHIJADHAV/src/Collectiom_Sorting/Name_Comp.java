package Collectiom_Sorting;

import java.util.Comparator;

public class Name_Comp implements Comparator
{

	
	public int compare(Object o1, Object o2) 
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		
		return e1.Emp_name.compareTo(e2.Emp_name);
		
		
	}

	
}
