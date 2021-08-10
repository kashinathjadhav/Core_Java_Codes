package collection_Map;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

//14) Write a program to sort keys in Tree Map by using comparator
public class homework_14 
{

	public static void main(String[] args) {
		
		TreeMap tr=new TreeMap();
		
		tr.put(1, (new Student(12,"kashi",300)));
		tr.put(2, (new Student(13,"vijay",200)));
		tr.put(3, (new Student(14,"shubhya",10)));
		tr.put(4, (new Student(15,"kk",100)));
		tr.put(5, (new Student(16,"yz",88)));
	}
}
