package Collection_Set_ERp_Assignment;

import java.util.Arrays;
import java.util.HashSet;

//7) Write a program to convert a hash set to anarray.
public class classwork_07 {

	public static void main(String[] args) 
	{
		 HashSet hs=new HashSet();
			
			hs.add("kksks");
			hs.add("jkkk");
			hs.add("djd");
			hs.add("jdjdj");
			//System.out.println(hs);
			
			Object[] a=hs.toArray();

			System.out.println(Arrays.toString(a));
	}

}
