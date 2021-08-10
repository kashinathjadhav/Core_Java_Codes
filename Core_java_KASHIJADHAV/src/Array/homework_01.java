package Array;
//1) Write a program to find the index of an array element.
public class homework_01 {

	public static void main(String[] args)
	{
		int arr[]= {1,3,7,8,9,10};
		
		int c=8;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==c)
			{
				System.out.println("found at index  "+i);
			}
		}

	}

}

 