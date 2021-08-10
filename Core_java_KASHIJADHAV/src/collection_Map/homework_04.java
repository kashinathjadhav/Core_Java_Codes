package collection_Map;

import java.util.HashMap;

//4) Write a program to create a set view of the mappings contained in a map.
public class homework_04 {

	public static void main(String[] args) 
	{
		HashMap hs=new HashMap();
		
		hs.put(11, "kashi");
		hs.put(12, "kkd");
		hs.put(14, "kashi");
		hs.put(19, "yz");
		hs.entrySet();
		
	System.out.println(hs);
	}

}
