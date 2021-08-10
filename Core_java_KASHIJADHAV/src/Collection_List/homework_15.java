package Collection_List;

import java.util.LinkedList;

//15) Write a program to remove a specified element from a linkedlist
public class homework_15 {

	public static void main(String[] args) {
        LinkedList lr=new LinkedList();
		
		lr.add("shubhya");
		lr.add("adi");
		lr.add("shyam");
		lr.add("jk");
		lr.add("kkk");
		lr.add("ldldk");
		lr.add("kwdopwm");
		lr.add("nwskned");
		lr.add("kwlk");
		lr.add("jk");
		lr.add("adi");
		
		System.out.println(lr);
		lr.remove(2);
		lr.remove(9);
		System.out.println(lr);

	}

}
