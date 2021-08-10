package Aarays;

import java.util.Scanner;

//2) Write a program to test if an array contains a specificvalue (Variations)
public class Homework_02 {

	public static void main(String[] args)
	{
	
		int arr[]= {11,33,4,55,6,77,8};
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enetr no");
		int n=sobj.nextInt();
		int cnt=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==n)
			{
				cnt++;
				break;
			}
			
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}

	}

}
