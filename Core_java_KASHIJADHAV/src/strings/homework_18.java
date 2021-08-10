package strings;

import java.util.Arrays;

//18) Write a program to reverse every word in a string using methods.
public class homework_18 {

	public static void main(String[] args) 
	{
		
		
		String s="I am in hefshine";
		
		int si=0;
		for (int i = 0; i <=s.length()-1; i++)
		{
			if(s.charAt(i)==' ')
			{
				for (int j=i-1; j >=si ; j--)
				{
				System.out.print(s.charAt(j));	
				}
				si=i+1;
				System.out.print(' ');
			}
			else if(i==s.length()-1)
			{
				for (int j =i; j>=si; j--)
				{
				System.out.print(s.charAt(j));	
				}
			}
		}
		
		/*String s="gazab ka hain yeh din";
		
		char arr[]=s.toCharArray();
		
		for (int i = 0; i < arr.length/2; i++) 
		{
			char c=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=c;
			
		}
		System.out.println(Arrays.toString(arr));
		*/
		

	}

}
