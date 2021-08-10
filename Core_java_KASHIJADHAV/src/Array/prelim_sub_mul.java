package Array;

public class prelim_sub_mul {

	public static void main(String[] args) {
		
		int arr1[][]= {{1,2},{3,4}};
		int arr2[][]= {{4,7},{5,6}};
		int arr3[][]=new int[2][2];
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr3.length; j++) 
			{
				int sum=0;
				for (int k = 0; k < arr3.length; k++) 
				{
					sum=sum+arr1[i][k]*arr2[k][j];
				}
				if(sum%2==0)
				{
					sum=sum/2;
				}
				else if(prime(sum))
				{
					sum=sum*3;
				}
				else
				{
					sum=sum*2;
				}
				arr3[i][j]=sum;
			}
		
			
		}
		
for (int i = 0; i < arr3.length; i++)
{
	for (int j = 0; j < arr3.length; j++) 
	{
	System.out.print(arr3[i][j]+" ");	
	}
	System.out.println();
}
	}
	
	

	private static boolean prime(int sum) {
		boolean flag=true;
		for (int i = 2; i < sum; i++) 
		{
		flag=false;
		break;
		}
		return flag;
	}

}
