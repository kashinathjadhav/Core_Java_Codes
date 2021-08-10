package Array;

import java.util.Arrays;

//Sort all even numbers in ascending order and then sort all odd numbers in descending order
/*
 * Input  : arr[] = {1, 2, 3, 5, 4, 7, 10}
 Output : arr[] = {7, 5, 3, 1, 2, 4, 10}

Input  : arr[] = {0, 4, 5, 3, 7, 2, 1}
Output : arr[] = {7, 5, 3, 1, 0, 2, 4} 
 */
public class soring {

	public static void main(String[] args) 
	{
		int arr[]={1, 2, 3, 5, 4, 7, 10};
		
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
		
		System.out.println("even cnt is"+ecnt);
		System.out.println("odd  cnt is"+ocnt);
		
		int even[]=new int[ecnt];
		int odd[]=new int[ocnt];
		int index=0;
		int index1=0;
		
		for (int i = 0; i <arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				even[index++]=arr[i];
			}
			else
			{
				odd[index1++]=arr[i];
			}
		}
		
		System.out.println("Even array\n"+Arrays.toString(even));
		System.out.println("odd array\n"+Arrays.toString(odd));
		
		System.out.println();
		
		for (int i = 0; i < odd.length; i++) 
		{
			for (int j = i+1; j < odd.length; j++)
			{
				if(odd[i]<odd[j])
				{
					int temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
		}
		
		System.out.println("odd descending array:\n"+Arrays.toString(odd));
		
		for (int i = 0; i < even.length; i++) 
		{
			for (int j = i+1; j < even.length; j++)
			{
				if(even[i]>even[j])
				{
					int temp=even[i];
					even[i]=even[j];
					even[j]=temp;
				}
			}
		}
		
		System.out.println("even ascending Order\n"+Arrays.toString(even));
		int index2=0;
		int[] arr2=new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			if(i<odd.length)
			{
				arr2[i]=odd[i];
			}
			if(i>=odd.length)
			{
				arr2[i]=even[index2++];
			}
		}
		System.out.println("final o/p\n"+Arrays.toString(arr2));
		

	}

}
