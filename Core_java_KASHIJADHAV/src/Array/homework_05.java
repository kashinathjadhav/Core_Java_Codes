package Array;
//5) Write a program to find and display reverse of an array using third variable
public class homework_05 
{
	

	public static void main(String[] args)
	{
		int arr[]= {12,22,33,44,55,66,77,88,99};
		
		for (int i = 0; i < arr.length/2; i++) 
		{
			int c=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=c;
		}

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
