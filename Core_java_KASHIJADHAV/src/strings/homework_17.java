package strings;

import java.util.Arrays;

//17) Write a program to count and print all the duplicates in the input string.
public class homework_17 {

	public static void main(String[] args) 
	{
		
		String s="abccdddd";
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
		System.out.println("duplicate count:"+cnt);
		
		
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
		System.out.println("unique char array");
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) 
		{
			int ecnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(arr[i]==s.charAt(j))
				{
					ecnt++;
				}
			}
			if(ecnt>1)
			{
				System.out.println(arr[i]+"   "+ecnt);
			}
		}
	}
}
 