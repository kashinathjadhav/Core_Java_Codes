package strings;

import java.util.Arrays;

//27) Write a program to convert all the characters in a string tolowercase
public class homework_27 {

	public static void main(String[] args) {
		
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
