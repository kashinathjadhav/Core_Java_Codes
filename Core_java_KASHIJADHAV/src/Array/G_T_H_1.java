package Array;
/*
 * 1. Write a program to find all the unique triplets such that sum of all the three elements 
 *  is equal to a
    specified number.(April Monthly).
Input-2.
Output- [[1,5,-4],[-2,5,-1]]
Reason: 1+5-4=2& -2+5-1=2 2 is Target ...
 */
public class G_T_H_1 {

	public static void main(String[] args) 
	{
	int arr[]= {1,2,3,5,-4,3,6,1};
	int sum=-2;
	
	for (int i = 0; i < arr.length-2; i++) 
	{
		for (int j = 0; j < arr.length-1; j++) 
		{
			for (int k = 0; k < arr.length; k++)
			{
				if((arr[i]+arr[j]+arr[k])==-2)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}
	}

}
