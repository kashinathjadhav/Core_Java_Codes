package MyHashMapString;

public class MyMainClass {

	public static void main(String[] args) {
		
		HashhMap map=new HashhMap();
		map.add("one", 11);
		map.add("two", 2);
		map.add("four", 4);
		System.out.println(map.get("four"));

	}

}
