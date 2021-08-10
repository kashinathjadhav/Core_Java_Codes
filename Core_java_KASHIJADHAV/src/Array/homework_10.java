package Array;
//10) Write a program to find maximum element in a matrix.

public class homework_10 {

	public static void main(String[] args)
	{
		
		int arr[]= {2,34,5,6,7,5,44,55};
		int max=Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				
				max=arr[i];
			}
			
		}
		System.out.println("second max is "+max);

	}

}
