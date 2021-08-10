package Array;
/*
 * 22)Write a program to calculate the subtraction and multiplication of two matrices entered by theuser.
 */
public class homework_22 {

	public static void main(String[] args)
	{
		int arr[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int arr2[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int arr3[][]=new int[arr.length][arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				for (int k = 0; k < arr.length; k++) {
					
				arr3[i][j]+=arr[i][k]*arr2[k][j];
				}
			}
			
		}
		
		for (int i = 0; i < arr3.length; i++) {
			
			for (int j = 0; j < arr3.length; j++) {
				
				System.out.print(arr3[i][j]+" ");
				
			}
			System.out.println();
			
		}


	

	}

}
