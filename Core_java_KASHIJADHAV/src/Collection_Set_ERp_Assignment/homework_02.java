package Collection_Set_ERp_Assignment;
//pending
import java.util.HashSet;
import java.util.Iterator;

//2) Write a program to compare two sets and retain elements which are same on bothsets
public class homework_02 {

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
		
		Iterator ir=hs.iterator();
		Iterator ir1=hs1.iterator();
		
		
		while(ir.hasNext() || ir1.hasNext())
		{
			if(ir.next()==ir1.next())
			{
				System.out.println(ir.next());
				ir1.next();
			}
			else
			{
				ir.next();
				ir1.next();
			}
		}

	}

}
