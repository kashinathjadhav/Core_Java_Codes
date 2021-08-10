package collection_Map;

import java.util.HashMap;

//1) Write a program to check whether a map contains key-value mappings (empty) ornot
public class homework_01 {

	public static void main(String[] args)
	{
		HashMap hs=new HashMap();
		
		hs.put(11, "kashi");
		hs.put(112, "kkd");
		hs.put(11, "kashi");
		hs.put(112, "kkd");
		hs.put(11, "kashi");
		hs.put(112, "kkd");
		hs.put(11, "kashi");
		hs.put(112, "kkd");
		hs.put(11, "kashi");
		hs.put(112, "kkd");
		
		
		System.out.println(hs.isEmpty());
		
		
	}

}
