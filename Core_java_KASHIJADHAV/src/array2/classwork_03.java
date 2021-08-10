package array2;

import java.util.Arrays;

//3. Write a program sort array elements in using selection sort
public class classwork_03 {

	public static void main(String[] args) 
	{
		int arr[]= {2,7,8,10,4,55,6,8};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int index=i;
			
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;//searching for lowest index
				}
			}
			
			int sno=arr[index];
			arr[index]=arr[i];
			arr[i]=sno;
		}


		System.out.println(Arrays.toString(arr));
	}

}
