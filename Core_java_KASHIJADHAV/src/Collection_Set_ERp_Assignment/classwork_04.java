package Collection_Set_ERp_Assignment;

import java.util.HashSet;

//4) Write a program to empty an hash set.
public class classwork_04 {

	public static void main(String[] args) {
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
