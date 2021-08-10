package Array;
//3. Write a program sort array elements in using selection sort.
public class classwork_03 {

	public static void main(String[] args) {
		
		
		int arr[]= {33,23,5,6,77};
		
		
		
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

		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
