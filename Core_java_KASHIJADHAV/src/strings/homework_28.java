package strings;
//28) Write a program to delete all extra blank spaces in a string by the user.
public class homework_28 {

	public static void main(String[] args) 
	{
	
		String s="   kashi nath   ";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
		
			if(s.charAt(i)==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
		
			if(s.charAt(i)!=' ')
			{
				s2+=s.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
