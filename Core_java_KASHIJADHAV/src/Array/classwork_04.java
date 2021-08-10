package Array;
//4. Write a program to arrange the elements of an given array of integers where all positive
//integers appear before all the negative integers.
public class classwork_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-1,2,4,-5,6,-4,3,5,6};
		
	      
		for (int i = 0; i < arr.length; i++) 
		{
			int max=i;
			
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j]>arr[max])
				{
					max=j;
				}
			}
			int c=arr[max];
			arr[max]=arr[i];
			arr[i]=c;
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
