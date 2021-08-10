package Array;

import java.util.Arrays;
import java.util.Scanner;

//29) Given an array of N distinct integer and a sum value S.

public class homework_29 {

	public static void main(String[] args) {
		
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter length of array");
		int len=sobj.nextInt();
		
		int arr[]=new int[len];
		System.out.println("enter "+ len+" elements");
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum is"+sum);

	}

}
