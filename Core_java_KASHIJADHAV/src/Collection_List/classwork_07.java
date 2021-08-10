package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

//7) Write a program to shuffle elements in a arraylist.
public class classwork_07 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		
		Collections.shuffle(ar);
		System.out.println(ar);
	}

}
