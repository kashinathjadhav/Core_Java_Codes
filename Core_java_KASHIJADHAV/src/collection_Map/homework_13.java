package collection_Map;

import java.util.TreeMap;

//13) Write a program to delete all elements from a given Tree Map.
public class homework_13 {

	public static void main(String[] args) 
	{
		TreeMap tr=new TreeMap();
		
		tr.put(1, "kashi");
		tr.put(11, "kdkdk");
		tr.put(5, "looos");
		tr.put(2, "jjd");
		
		System.out.println(tr);
		tr.clear();
		
		System.out.println(tr);
		

	}

}
