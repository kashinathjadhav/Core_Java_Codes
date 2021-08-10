package Collection_List;

import java.util.ArrayList;

//10) Write a program to copy one array list into another.
public class classwork_10 {

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		ArrayList ar2=new ArrayList(ar);
		System.out.println(ar2);

	}

}
