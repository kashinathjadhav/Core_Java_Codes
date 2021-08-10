package Collection_List;

import java.util.ArrayList;

//3) Write a program to insert an element into the array list at the first position.
public class classwork_03 {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("pune");
		ar.add("pune");
		ar.add("pune");
		ar.add("pune");
		ar.add("pune");
		ar.add("pune");
		System.out.println(ar);
		ar.add(0, "latur");
		System.out.println(ar);
	}

}
