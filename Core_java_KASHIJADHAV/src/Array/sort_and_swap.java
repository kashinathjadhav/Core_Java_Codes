package Array;

import java.util.Arrays;

public class sort_and_swap {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i < arr.length-1; i=i+2)
		{
			int swap=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=swap;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
