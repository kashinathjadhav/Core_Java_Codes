package strings;
//24) Write a program to find frequency of character in a string

import java.util.Arrays;

public class homework_24 {

	public static void main(String[] args) {
		
		String s="kkkaassjjkk";
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
			System.out.println(arr[i]+" count is "+ecnt);
		}
		
		
		
		
		
		/*
		 for (int i = 0; i < s.length(); i++)
		 
		{
			if(s.charAt(i)==c)
			{
				cnt++;
			}
		}
		System.out.println("frequancy is"+cnt);
		*/

	}

}
