package strings;
//15) Write a program to return a string with the characters of the index position 0,1,2,
//5,6,7, ... from a given string
public class homework_15 {

	public static void main(String[] args)
	{
		String s="Vijay";
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i)+" at :"+i);
		}

	}

}
