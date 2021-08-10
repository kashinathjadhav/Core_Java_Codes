package Array;

import java.util.Scanner;

/*
 * 33) Write a program to take 10 integer inputs from user and print the number of positive numbers, number
of negative numbers, number of odd numbers number of even number
 */
public class homework_33 {

	public static void main(String[] args)
	{
		
       Scanner sobj=new Scanner(System.in);	
       
       System.out.println("enter the length of array");
       int length=sobj.nextInt();

       int arr[]=new int[length];
       System.out.println("enter the elements");
       
       for (int i = 0; i < arr.length; i++) 
       {
		arr[i]=sobj.nextInt();
	   }
       
       int ecnt=0;
       int ocnt=0;
       int pcnt=0;
       int ncnt=0;
       
       
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
		
		if(arr[i]<0)
		{
			ncnt++;
		}
		else
		{
			pcnt++;
		}
	   }
       
       System.out.println("positive count is"+pcnt);
       System.out.println("negtive"+ncnt);
       System.out.println("even cnt"+ecnt);
       System.out.println("odd cnt"+ocnt);
	}

}
