package Array;
//20)Write a program calculate the average of the inner elements of an array
public class homework_20 
{

	public static void main(String[] args)
	{
		
		int arr[][]= {{1,5,5,4},{1,3,3,4},{1,3,3,4},{1,10,10,4}};
		
		int sum=0;
		int cnt=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
		
			for (int j = 0; j < arr.length; j++) 
			{
				if(i!=0 && j!=0 && i!=arr.length-1 && j!=arr.length-1)
				{
				sum=sum+arr[i][j];
				cnt++;
				}
			}
		}
		
		System.out.println(sum/cnt);
		

	}

}
