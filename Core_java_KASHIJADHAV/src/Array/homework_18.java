package Array;

import java.util.Arrays;

//18) Write a program to separate even and odd numbers of an given array of
//integers. Put all even numbers first, and then odd numbers.
public class homework_18 {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7};
		int b[]=new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
			{
				b[index++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
		
		/*
		 * int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int ecnt=0;
		int ocnt=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				ecnt++;
			}
			else
			{
				ocnt++;
			}
		}
		
		System.out.println(ecnt);
		System.out.println(ocnt);
		
		int even[]=new int[ecnt];
		int odd[]=new int[ocnt];
		int eindex=0;
		int oindex=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				even[eindex++]=arr[i];
			}
			else
			{
				odd[oindex++]=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
		int narr[]=new int[arr.length];
		int nindex=0;
		int ooindex=0;
		for (int i = 0; i < arr.length; i++)
		{
			
			if(i<even.length)
			{
				narr[nindex++]=even[i];
			}
			else
			{
				narr[nindex++]=odd[ooindex];
				ooindex++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(narr));
	}
	*/
		
		
	

}
