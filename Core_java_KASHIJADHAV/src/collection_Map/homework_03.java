package collection_Map;

import java.util.HashMap;

//3) Write a program to test if a map contains a mapping for the specified value
public class homework_03 {

	public static void main(String[] args)
	{
		HashMap hs=new HashMap();
		
		hs.put(11, "kashi");
		hs.put(12, "kkd");
		hs.put(14, "kashi");
		hs.put(19, "yz");
		
		System.out.println(hs.containsValue("kk"));

	}

}
