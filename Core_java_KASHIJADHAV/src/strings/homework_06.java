package strings;
//6) Write a program to get the last index of a string within a string.
public class homework_06 {

	public static void main(String[] args) {
		
		String s="kashinath jadhav";
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				index=i-1;
				break;
			}
		}
		System.out.println(index);
		

	}

}
