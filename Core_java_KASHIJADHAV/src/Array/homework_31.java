package Array;
//31) Write a program to find sum of diagonal elements of a matrix.
public class homework_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},
				      {2,3,4},
				      {5,6,7}};
		int sum=0;
		
		
		for (int i = 0; i < arr.length; i++)
		{
			
			for (int j = 0; j < arr.length; j++)
			{
			
				if(i==0 || i==arr.length-1 || j==0 || j==arr.length-1)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		
		System.out.println(sum);

	}

}
