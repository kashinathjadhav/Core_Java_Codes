package Collection_List;

import java.util.ArrayList;

//4) Write a program to clone an array list to another arraylist.
public class homework_04 {

	public static void main(String[] args) 
	{
	
		
		 ArrayList ar=new ArrayList();
			
			ar.add("kasojs");
			ar.add("jadhav");
			ar.add("vijay");
			ar.add("abhi");
			ar.add("sisjsijo");
			
			ArrayList ar2=(ArrayList) ar.clone();	
			
	        System.out.println(ar2);
	}

}
