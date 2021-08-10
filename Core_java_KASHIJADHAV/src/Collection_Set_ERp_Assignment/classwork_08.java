package Collection_Set_ERp_Assignment;

import java.util.HashSet;
import java.util.TreeSet;

//8) Write a program to convert a hash set to a tree set. 
public class classwork_08 {

	public static void main(String[] args) {
		
		
		 HashSet hs=new HashSet();
			
			hs.add("kksks");
			hs.add("jkkk");
			hs.add("djd");
			hs.add("jdjdj");
			
			TreeSet tr=new TreeSet(hs);
			
			System.out.println(tr);

	}

}
