package Array;
//5. Write a program to find transpose of a matrix.
public class classwork_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,1},{2,2}};
		int arr2[][]=new int[2][2];
		
		System.out.println("before transpose");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
			System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}

		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				
				arr2[i][j]=arr[j][i];
			}
	    }
		
		System.out.println("after transpose");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
			System.out.print(arr2[i][j]+" ");	
			}
			System.out.println();
		}

}
}
