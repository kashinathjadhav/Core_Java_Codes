package Collectiom_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Write a program to create a class Employee with a p p r o p r i a t e d a t a m e m b e r s .
//Display an dexplainthe Comparator implementations for each Employeeattribute
public class Classwork_01 {

	public static void main(String[] args) 
	{
	    ArrayList ar=new ArrayList();
	    
	    ar.add( new Employee("kashi",12,100));
	    ar.add( new Employee("vijay",13,500));
	    ar.add( new Employee("ashu",14,400));
	    
	    System.out.println("sorting by salary");
	    Collections.sort(ar,new Salary_comp());
		
	    Iterator itr2=ar.iterator();  
	    while(itr2.hasNext())
	    {
		   Employee emp=(Employee)itr2.next();
		   System.out.println(emp.Emp_name+"  "+emp.emp_id+"  "+emp.salary);
	    }  
	    
	    System.out.println();
	    
	    
	    System.out.println("sorting by name");
	    Collections.sort(ar,new Name_Comp());
	   
	    Iterator ir3=ar.iterator();
	    while(ir3.hasNext())
	    {
		   Employee emp=(Employee)ir3.next();
		   System.out.println(emp.Emp_name+"  "+emp.emp_id+"  "+emp.salary);
	    }  
	    
	}
	

}
