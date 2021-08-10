package Array;
//16) Write a program to get the difference between the largest and smallest
//values in an array of integers
public class homework_16 {

	public static void main(String[] args) 
	{
		
		int arr[]= {11,3,4,55,66,8,4,44};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		System.out.println(max-min);
	}

}
