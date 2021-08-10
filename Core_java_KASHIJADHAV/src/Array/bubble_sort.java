package Array;

public class bubble_sort {

	public static void main(String[] args) {
		
		int arr[]= {1,3,55,3,4,66,77,88};
		
		for (int i = 0; i < arr.length; i++) 
		{
		
			for (int j = i+1; j < arr.length-i; j++) 
			{
				if(arr[i]>arr[j])
				{
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
