package collection_Map;

import java.util.HashMap;

//1) Write a program to associate the specified value with the specified key in a
//HashMap.
public class classwork_01 {

	public static void main(String[] args) 
	{
		
		HashMap hs=new HashMap();
		
		hs.put(11,"ashya");
		hs.put(34, "kashi");
		hs.put(43,"ooo");
		
		System.out.println(hs.keySet()+"  "+hs.values());
		
	}

}
