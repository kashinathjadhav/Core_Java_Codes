package Array;
//8) Write a program to find the second largest element in anarray
public class homework_08 {

	public static void main(String[] args) {
		
		int arr[]= {2,34,5,6,7,5,44,55};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		System.out.println("second max is"+max2);

	}

}
