package collection_Map;

import java.util.HashMap;

//3) Write a program to copy all of the mappings from the specified map to
//another map.
public class classwork_03 {

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
		
		HashMap hs2=new HashMap(hs);
		
		System.out.println(hs2);
	}

}
