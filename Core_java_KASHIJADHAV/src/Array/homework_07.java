package Array;
//7) Write a program sort array elements in ascending order using bubble sort
public class homework_07 {

	public static void main(String[] args) 
	{
		
     int arr[]= {22,3,45,6,7,8};
     
     for (int i = 0; i < arr.length; i++) 
      {
		for (int j = i+1; j < arr.length; j++)
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
