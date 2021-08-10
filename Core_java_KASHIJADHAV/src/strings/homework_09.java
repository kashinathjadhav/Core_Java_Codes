package strings;
/*
 * 9) Write a program to check whether a given string starts with the contents of
another string.
 */
public class homework_09 {

	public static void main(String[] args) 
	{
		String s="Kashi";
		String s2="i";
		int cnt=0;
		for (int i = 0; i < s2.length(); i++)
		{
			if(s2.charAt(i)!=s.charAt(i))
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("yes start with");
		}
		else
		{
			System.out.println("not");
		}
		
		

	}

}
