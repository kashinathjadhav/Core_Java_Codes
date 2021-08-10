package Array;
/*
 * 2. Write a program to Find unique Pair Of Integers in Array whose Sum is Given Number
 *  Given array : 
 *  
 *  [2,4, 3, 5, 6, -2, 4, 7, 8, 9]
Given sum : 7
Integer numbers, whose sum is equal to value : (2, 5) (4, 3) (-2, 9) . .(April Monthly).
 */
public class G_T_H_2
{

	public static void main(String[] args) 
	{
		
      int arr[]= {2,4, 3, 5, 6, -2, 7, 8, 9};
      
      
      for (int i = 0; i < arr.length; i++) 
       {
	     for (int j = 0; j < arr.length; j++) 
	     {
			if(arr[i]+arr[j]==7)
			{
				System.out.println(arr[i]+" "+arr[j]);
			}
		 }
	   }
	}

}
