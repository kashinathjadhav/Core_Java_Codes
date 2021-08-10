package Array;//21) Write a program to print the addition of two matrices.
public class Homework_21 
{

	public static void main(String[] args) 
	{
		int arr1[][]= {{1,2,3},{1,2,3}};
		int arr2[][]= {{4,5,6},{9,8,7}};
		
		int sum[][]=new int[arr1.length][arr1.length];
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for (int i = 0; i < sum.length; i++) 
		{
		
			for (int j = 0; j < sum.length; j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
