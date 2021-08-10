package strings;
//4) Write a program to compare two strings lexicographically, ignoring casedifferences.
public class classwork_04 {

	public static void main(String[] args) 
	{
	String s1="KashiI";
	String s2="Kashii";
	
	boolean flag=true;
	
	for (int i = 0; i < s1.length() && i<s2.length(); i++) 
	{
		if(s1.charAt(i)!=s2.charAt(i))
		{
			System.out.println(s1.charAt(i)-s2.charAt(i));
			flag=false;
			break;
		}
	}

	if(flag)
	{
		if(s1.length()!=s2.length())
		{
			System.out.println(s1.length()-s2.length());
		}
		else
		{
			System.out.println(0);
		}
	}
	}

}
