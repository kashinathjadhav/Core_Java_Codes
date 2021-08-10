package Collection_Set_ERp_Assignment;

import java.util.HashSet;

//6) Write a program to clone a hash set to another hash set
public class classwork_06 {

	public static void main(String[] args) {
		
		 HashSet hs=new HashSet();
			
			hs.add("kksks");
			hs.add("jkkk");
			hs.add("djd");
			hs.add("jdjdj");
			System.out.println(hs);
		HashSet hs1=(HashSet) hs.clone();
		
		System.out.println(hs1);

	}

}
