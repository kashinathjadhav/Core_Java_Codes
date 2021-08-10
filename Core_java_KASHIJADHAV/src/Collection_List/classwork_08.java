package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

//8) Write a program to sort a given array list
public class classwork_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add("kasojs");
		ar.add("jadhav");
		ar.add("vijay");
		ar.add("abhi");
		ar.add("sisjsijo");
		
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);

	}

}
