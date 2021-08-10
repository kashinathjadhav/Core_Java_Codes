package LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkeddList list=new LinkeddList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
		list.delete(5);
		list.print();
		
		System.out.println("at index:"+list.find(3));

	}

}
