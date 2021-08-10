package Collectiom_Sorting;

import java.util.Comparator;

public class Salary_comp implements Comparator{
	
	public int compare(Object o1,Object o2){  
		Employee s1=(Employee)o1;  
		Employee s2=(Employee)o2;  
		  
		if(s1.salary==s2.salary)  
		return 0;  
		else if(s1.salary>s2.salary)  
		return 1;  
		else  
		return -1;  
		}

	

}
