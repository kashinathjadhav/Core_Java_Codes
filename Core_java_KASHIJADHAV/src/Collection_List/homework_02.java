package Collection_List;
//2) Write a program to compare two array lists

import java.util.ArrayList;

public class homework_02 
{

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);

		ArrayList ar2=new ArrayList();
		
		ar2.add("kasojs");
		ar2.add("jadhav");
		ar2.add("vijay");
		ar2.add("abhi");
		ar2.add("sisjsijo");
		
		System.out.println(ar.equals(ar2));
		
	}

}
