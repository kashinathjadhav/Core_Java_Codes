package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

//9) Write a program to reverse elements in a array list.
public class classwork_09 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		
	}

}
