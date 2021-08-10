package strings;
//26) Write a program to repeat each of the character twice in a given string.
public class homework_26 {

	public static void main(String[] args) 
	{
		

		String s="kashi";
		
		String s2="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			s2+=s.charAt(i);
			s2+=s.charAt(i);
		}
		
		System.out.println(s2);
	}

}
