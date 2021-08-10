package hefshineTreeMap;

public class MyMain {

	public static void main(String[] args) {
		
		MyTreeMap mm=new MyTreeMap();
		
		mm.add(1, "jddj");
		mm.add(33, "kdkdk");
		mm.add(56, "jjl");
		mm.add(20, "oooo");
		
		mm.print();
		
		System.out.println(mm.get(33));

	}

}
