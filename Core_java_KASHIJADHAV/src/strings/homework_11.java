package strings;
//11) Write a program to convert all the characters in a string to lowercase
public class homework_11 {

	public static void main(String[] args) 
	{
		String s="KASHI";
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s2+=(char)(s.charAt(i)+32);
			}
			else
			{
				s2+=s.charAt(i);
			}
		}
		
		System.out.println(s2);

	}

}
