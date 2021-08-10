package collection_Map;

import java.util.HashMap;

//2) Write a program to test if a map contains a mapping for the specified key.
public class homework_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hs=new HashMap();
		
		hs.put(11, "kashi");
		hs.put(12, "kkd");
		hs.put(14, "kashi");
		hs.put(19, "kkd");
		
		System.out.println(hs.containsKey(12));

	}

}
