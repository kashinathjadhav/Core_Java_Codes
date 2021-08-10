package collection_Map;

import java.util.HashMap;

//2) Write a program to count the number of key-value (size) mappings in amap
public class classwork_02 {

	public static void main(String[] args) 
	{
		HashMap hs=new HashMap();
		
		hs.put(1, "ksks");
		hs.put(2, "idnd");
		hs.put(4, "kdkdk");
		hs.put(5, "kdkd");
		hs.put(6, "dld;;");
		hs.put(7, "kdkdk");
		hs.put(8, "ksks");
		hs.put(9, "idnd");
		hs.put(10, "kdkdk");
		
		
		System.out.println(hs.keySet().size());
	}

}
