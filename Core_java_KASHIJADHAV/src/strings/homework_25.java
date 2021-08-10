package strings;

import java.util.Arrays;

//25) Write a program to get lowest frequency of a character in a string.
public class homework_25 
{

	public static void main(String[] args)
	{
		String s="jjjkkkv";
		char c='/';
		int cnt=0;
		
		
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j <s.length(); j++)
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
		
		for (int i = 0; i <s.length(); i++)
		{
			int pcnt=0;
			for (int j = 0; j < arr.length; j++) 
			{
			if(s.charAt(i)==arr[j])	
			{
				pcnt++;
				break;
			}
			}
			if(pcnt==0)
			{
				arr[index++]=s.charAt(i);
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		int ecnt=0;
		char d='/';
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			ecnt=0;
			
			for (int j = 0; j < s.length(); j++)
			{
				if(arr[i]==s.charAt(j))
				{
					ecnt++;
				}
			}
			if(ecnt<min)
			{
				min=ecnt;
				d=arr[i];
				
			}
		}
		System.out.println(ecnt+" "+d);


	}

}
