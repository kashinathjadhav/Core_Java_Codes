package collection_Map;

import java.util.TreeMap;

//12) Write a program to search a value in a Tree Map.
public class homework_12 {

	public static void main(String[] args) {
		
		TreeMap tr=new TreeMap();
		
		tr.put(1, "kashi");
		tr.put(11, "kdkdk");
		tr.put(5, "looos");
		tr.put(2, "jjd");
		
		System.out.println(tr.containsValue("kashi"));

	}

}
