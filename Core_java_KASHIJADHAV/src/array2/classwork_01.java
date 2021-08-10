package array2;
//1. Write a program to calculate sum and average of arrayelements
public class classwork_01 {

	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,4,5,6,7,8,9};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}

		System.out.println(sum);
		System.out.println((sum/arr.length));

	}

}
