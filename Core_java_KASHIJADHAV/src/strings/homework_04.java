package strings;
//4) Write a program to compare a given string to another string, ignoring case
//considerations.
public class homework_04 
{

	public static void main(String[] args)
	{
		

		String s1="kashi";
		String s2="KASHi";
		//if length of both string is different then exit i.e not same no need to cmp every char
		if(s1.length()!=s2.length())
		{
			System.out.println("not same");
			System.exit(0);
		}
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		String c="";
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				c=c+(char)(a[i]-32);
			}
			else
			{
				c=c+a[i];
			}
		}
		System.out.println(c);
		
		String d="";
		for (int i = 0; i < b.length; i++)
		{
			if(b[i]>=97 && b[i]<=122)
			{
				d=d+(char)(b[i]-32);
			}
			else
			{
				d=d+b[i];
			}
		}
		System.out.println(d);
		//comparing every character
		int cnt=0;
		for (int i = 0; i < c.length(); i++)
		{
			if(c.charAt(i)!=d.charAt(i))
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		
			}
	
}
