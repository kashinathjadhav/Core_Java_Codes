package Array;

import java.util.Arrays;

//13) Write a program to create an array of its anti-diagonals from a given
//square matrix.
public class homework_13 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
		              {2,3,4,5},
		              {1,2,4,6},
		              {1,2,4,6}};
		
		int cnt=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(i!=0 && j!=0 && i!=arr.length-1 && j!=arr.length-1)
				{
				cnt++;	
				}
			}
		}
		int anti[]=new int[cnt];
		int index=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(i!=0 && j!=0 && i!=arr.length-1 && j!=arr.length-1)
				{
				anti[index++]=arr[i][j];
				}
			}
		}
		
		System.out.println(Arrays.toString(anti));

	}

}
