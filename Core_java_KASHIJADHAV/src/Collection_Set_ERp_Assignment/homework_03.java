package Collection_Set_ERp_Assignment;

import java.util.HashSet;

//3) Write a program to remove all of the elements from a hashset.
public class homework_03 {

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		
		hs.add("kksks");
		hs.add("jkkk");
		hs.add("djd");
		hs.add("jdjdj");
		
        System.out.println(hs);
        hs.removeAll(hs);
        System.out.println(hs);
	}

}
