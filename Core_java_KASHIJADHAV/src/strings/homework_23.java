package strings;
//23) Write a program to trim any leading or trailing whitespace from a given string.

public class homework_23 
{

	public static void main(String[] args)
	{
		String s="    kashinath Jadhav       ";
		System.out.println(s);
		
		int si=0;
		int ei=0;
		
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		System.out.println(si);
		
		for (int i =s.length()-1; i >=0; i--) 
		{

			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		
		System.out.println(ei);
		
		for (int i = si; i <=ei ; i++) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
