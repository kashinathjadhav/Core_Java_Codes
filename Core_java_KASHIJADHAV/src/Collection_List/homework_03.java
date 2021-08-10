package Collection_List;

import java.util.ArrayList;

//3) Write a program to join two arraylists.
public class homework_03 {

	public static void main(String[] args) 
	{
    ArrayList ar=new ArrayList();
		
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		//System.out.println(ar);

		ArrayList ar2=new ArrayList();
		
		ar2.add("abcd");
		ar2.add("jssks");
		ar2.add("ksks");
		ar2.add("aksksk");
		ar2.add("ssll");
		
		ar.add(ar2);
		
		System.out.println(ar);

	}

}
