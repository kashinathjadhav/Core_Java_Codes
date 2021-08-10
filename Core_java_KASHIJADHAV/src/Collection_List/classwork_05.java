package Collection_List;

import java.util.ArrayList;

//5) Write a program to update specific array element by given element.
public class classwork_05 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		ar.set(4, "shubham");
		System.out.println(ar);
		

	}

}
