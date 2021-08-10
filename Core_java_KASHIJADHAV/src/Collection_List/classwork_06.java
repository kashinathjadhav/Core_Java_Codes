package Collection_List;

import java.util.ArrayList;

//6) Write a program to remove the third element from a array list
public class classwork_06 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		
		ar.remove(1);

		System.out.println(ar);
	}

}
