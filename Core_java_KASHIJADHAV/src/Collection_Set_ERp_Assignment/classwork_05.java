package Collection_Set_ERp_Assignment;

import java.util.HashSet;

//5) Write a program to test a hash set is empty or not.
public class classwork_05 {

	public static void main(String[] args) 
	{
		
        HashSet hs=new HashSet();
		
		hs.add("kksks");
		hs.add("jkkk");
		hs.add("djd");
		hs.add("jdjdj");
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println(hs.isEmpty());
	}

}
