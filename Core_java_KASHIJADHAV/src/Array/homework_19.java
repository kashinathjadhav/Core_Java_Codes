package Array;
//19) Write a program to display data in 2D array.

public class homework_19 {

	public static void main(String[] args) 
	{
		
     int arr[][]= {{1,2,3},{1,2,3},{1,7,8}};
     
     for (int i = 0; i < arr.length; i++)
     {
		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
	

}
