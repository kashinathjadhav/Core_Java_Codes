package strings;
//8) Write a program to replace all the 'd' characters with 'f'characters
public class homework_08 {

	public static void main(String[] args) {
		
		String s="abcdeffddd dd";
		
		String s1="";
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='d')
			{
				s1+='f';
			}
			else
			{
				s1+=s.charAt(i);
			}
		}
		
		System.out.println(s1);

	}

}
