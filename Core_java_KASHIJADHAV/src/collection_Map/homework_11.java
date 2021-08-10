package collection_Map;

import java.util.TreeMap;

//11) Write a program to get all keys from the given a Tree Map.
public class homework_11 {

	public static void main(String[] args) {
		
		TreeMap tr=new TreeMap();
		
		tr.put(1, "kashi");
		tr.put(11, "kdkdk");
		tr.put(5, "looos");
		tr.put(2, "jjd");
	
		System.out.println(tr.keySet());

	}

}
