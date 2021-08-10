package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

//18) Write a program to shuffle the elements in a linked list.
public class homework_18 {

	public static void main(String[] args) 
	{
		 LinkedList lr=new LinkedList();
			
			lr.add("shubhya");
			lr.add("adi");
			lr.add("shyam");
			lr.add("jk");
			lr.add("kkk");
			lr.add("ldldk");
			lr.add("kwdopwm");
			lr.add("nwskned");
			lr.add("kwlk");
			lr.add("jk");
			lr.add("adi");
			
			Collections.shuffle(lr);
			System.out.println(lr);

	}

}
