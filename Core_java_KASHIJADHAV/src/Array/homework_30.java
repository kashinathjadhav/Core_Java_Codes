package Array;
/*
 * 30) Write a program to find out count of triplets with sum smaller than given
 * sum value.
Examples:
Array=[5,1,3,4,7
] S=12.
Output :4
Explaination: Below are triplets with sum less than 12
(1,3,4),(1,3,5),(1,3,7),(1,4,5)

 */
public class homework_30 {

	public static void main(String[] args) {
		
		int arr[]= {5,1,3,4,7};
		
		int sum=12;
		int cnt=0;
		for (int i = 0; i < arr.length-2; i++) 
		{
		
			for (int j = i+1; j < arr.length-1; j++)
			{
				
				for (int k = j+1; k < arr.length; k++) 
				{
				if((arr[i]+arr[j]+arr[k])<sum)
				{
					cnt++;
				}
				}
			}
		}
		System.out.println("count is"+cnt);
	}

}
