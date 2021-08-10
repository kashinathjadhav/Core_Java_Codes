package Collection_Set_ERp_Assignment;

import java.util.HashSet;

//1) Write a program to compare two hash set.
public class homework_01 {

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		
		hs.add("kksks");
		hs.add("jkkk");
		hs.add("djd");
		hs.add("jdjdj");
		
		
        HashSet hs1=new HashSet();
		
		hs1.add("kksks");
		hs1.add("jkkk");
		hs1.add("djd");
		hs1.add("jdjdj");
		System.out.println(hs.equals(hs1));
		

	}

}
