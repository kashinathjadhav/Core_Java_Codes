package Array;

import java.util.Arrays;

//34) Write a program to merge two arrays into third array
public class homework_34 {

	public static void main(String[] args) 
	{
	
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {2,3,4,5,7,10};
		int index=0;
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr3.length;i++)
		{
			
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
			}
			if(i>=arr1.length)
			{
				arr3[i]=arr2[index];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
