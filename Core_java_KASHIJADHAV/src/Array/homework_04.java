package Array;
//4) Write a program to copy an array by iterating thearray.
public class homework_04 {

	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int arr2[]=new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=arr[i];
		}
		
		for (int i = 0; i < arr2.length; i++)
		{
		System.out.println(arr2[i]);	
		}

	}

}
