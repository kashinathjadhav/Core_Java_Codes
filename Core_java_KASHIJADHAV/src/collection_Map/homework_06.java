package collection_Map;

import java.util.HashMap;

//6) Write a program to get a set view of the keys contained in thismaprc.
public class homework_06 {

	public static void main(String[] args) 
	{
        HashMap hs=new HashMap();
		
		hs.put(11, "kashi");
		hs.put(12, "kkd");
		hs.put(14, "kashi");
		hs.put(19, "yz");
		System.out.println(hs.keySet());
		
		

	}

}
