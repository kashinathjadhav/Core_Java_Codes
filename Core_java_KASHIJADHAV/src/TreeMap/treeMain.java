package TreeMap;

public class treeMain {

	public static void main(String[] args) {
		
		MyTree mm=new MyTree();
		mm.add(10);
		mm.add(20);
		mm.add(11);
		mm.add(23);
		mm.add(98);
		
		mm.print();
		
		System.out.println(mm.contains(9));
	}

}
