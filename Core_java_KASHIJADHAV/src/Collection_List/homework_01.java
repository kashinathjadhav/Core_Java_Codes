package Collection_List;

import java.util.ArrayList;

//1) Write a program to extract a portion of a array list
public class homework_01 {

	public static void main(String[] args) 
	{

		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		System.out.println(ar.subList(1, 2));

	}

}
