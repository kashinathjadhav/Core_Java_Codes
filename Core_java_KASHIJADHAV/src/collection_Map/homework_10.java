package collection_Map;

import java.util.TreeMap;

//10) Write a program to copy a Tree Map content to another Tree Map.
public class homework_10 {

	public static void main(String[] args) {
		
TreeMap tr=new TreeMap();
		
		tr.put(1, "kashi");
		tr.put(11, "kdkdk");
		tr.put(5, "looos");
		tr.put(2, "jjd");
		TreeMap tr2=new TreeMap(tr);
		
		System.out.println(tr2);

	}

}
