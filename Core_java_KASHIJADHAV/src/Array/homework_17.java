package Array;

import java.util.Arrays;

//17) Write a program to replace 0‟s with 1‟s. e.g array is [0,1,0,1,0,1,0,1,0,1,0,1,0]
public class homework_17 {

	public static void main(String[] args)
	
	{
	int arr[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
	
	for (int i = 0; i < arr.length; i++)
	{
	
		if(arr[i]==0)
		{
			arr[i]=1;
		}
	}

	System.out.println(Arrays.toString(arr));
	}

}
