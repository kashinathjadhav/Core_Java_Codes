package Array;

import java.util.Arrays;
import java.util.Iterator;

/*
 * 6. Number of unique pairs in an array. Give non array of N elements, that ask is to find all the unique
pairs that can be formed using the elements of a given array.(MarchMonthly).
Examples: Input: arr[] = {1, 1, 2}
Output: 4
(1, 1), (1, 2), (2, 1), (2, 2) are the only possible pairs.
Input: arr[] = {1, 2, 3}
Output: 9
 */
public class classwork_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,1};
		
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =i+1; j < a.length; j++)
			{
				if (a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println("cnt"+cnt);
		
		int b[]=new int[a.length-cnt];
		
		int ind=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt1=0;
			for (int j = 0; j < b.length; j++)
			{
				if (b[j]==a[i]) 
				{
					cnt1++;
					
				}
			}
			if (cnt1==0)
			{
				b[ind++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		int fcnt=0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
			
				fcnt++;
				
			}
		}
		System.out.println("count is"+fcnt);
		
	}

}
