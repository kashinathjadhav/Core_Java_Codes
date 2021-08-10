package Array;
/*
 * 26)Given an integer array and size of subarray,find the first subarray with leasts
average in single loop. Print first index of subarray and average. (Mindstix)
Method signature Find Firstsub(int arr[], int arr_len, int sub_arr_len)
{
//Your code
}
Example:
Input:
int arr={3,7,90,20,5,50,40}, k=3
Find Firstsub(arr,7)
Output:
Index:3 Avg:25

 */
public class homework_26 {

	public static void main(String[] args) 
	{
		
		int  []a= {3,7,90,20,5,50,40};
		int k=3;
		int si=0;
		
		int avg=Integer.MAX_VALUE;
	    for (int i = 0; i < a.length-k+1; i++)
		{
			int sum=0;
			int tavg=0;
			
			for(int j=i;j<i+k;j++)
			{
				sum=sum+a[j];
				tavg=sum/k;
			}
		if(tavg<avg)
			{
				avg=tavg;
				si=i;
			}
		}
		System.out.println("starting index"+si);
		System.out.println("average is:"+avg);


	}

}
