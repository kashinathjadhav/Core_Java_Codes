package Collectiom_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Homework_03 {

	public static void main(String[] args) 
	{
	
		ArrayList ar=new ArrayList();
		
		ar.add(new Student(12,"kaak",70));
		ar.add(new Student(13,"zxcv",34));
		ar.add(new Student(14,"iekek",88));
		ar.add(new Student(15,"jp",70));
		ar.add(new Student(19,"peoe",07));
		
		System.out.println("sorting by name");
		Collections.sort(ar,new sname_comp());
		Iterator ir=ar.iterator();
		while(ir.hasNext())
		{
			Student s1=(Student)ir.next();
			
			System.out.println(s1.roll+"  "+s1.name+"  "+s1.marks);
		}
		
		System.out.println();
		System.out.println("sorting by roll");
		
		Collections.sort(ar,new smarks_comp());
		Iterator ir1=ar.iterator();
		while(ir1.hasNext())
		{
			Student s2=(Student)ir1.next();
			
			System.out.println(s2.roll+"  "+s2.name+"  "+s2.marks);
		}

	}

}
