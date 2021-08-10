package Array;

public class positiveNegtive {

	public static void main(String[] args) {
		
		int arr[]= {1,-2,3,44,-8,6,9,4,3,5};
		
		for (int i = 0; i < arr.length; i++)
		{
		
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				
				if(arr[i]>arr[j] && arr[j]>0)
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
