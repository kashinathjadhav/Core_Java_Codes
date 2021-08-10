package strings;
//12) Write a program to convert all the characters in a string touppercase.
public class homework_12 {

	public static void main(String[] args) {
		

		String s="vijay";
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s2+=(char)(s.charAt(i)-32);
			}
			else
			{
				s2+=s.charAt(i);
			}
		}
		
		System.out.println(s2);
	}

}
