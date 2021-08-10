package strings;

import java.util.Arrays;

//20) Write a program to print after removing duplicates from a given string.
public class homework_20 {

	public static void main(String[] args) 
	{
		
		String s="kashinath";
		
		int cnt=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
			    }
			
			}
		}
		System.out.println(cnt);
		char arr[]=new char[s.length()-cnt];
		int index=0;
		int ecnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			ecnt=0;
			for (int j = 0; j < arr.length; j++) 
			{
				
				if(s.charAt(i)==arr[j])
				{
				ecnt++;	
				break;
				}
			}
			if(ecnt==0)
			{
				arr[index++]=s.charAt(i);
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
