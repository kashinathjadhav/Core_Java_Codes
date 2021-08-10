package Array;
//11) Write a program to remove the duplicate elements of a given array and return the new length
//of the array.
public class homework_11 {

	public static void main(String[] args)
	{
    int arr[]= {1,2,3,4,5,1,1,1,3,4,5,8};
    
    int cnt=0;
    
    for (int i = 0; i < arr.length; i++) 
    {
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[i]==arr[j])
			{
				cnt++;
				break;
			}
		}
	}
    System.out.println("count is"+cnt);
		
    int arr2[]=new int[arr.length-cnt];
    
    int index=0;
    int ecnt=0;
    for (int i = 0; i < arr.length; i++) 
    {
    	 ecnt=0;
		for (int j = 0; j < arr2.length; j++)
		{
			if(arr[i]==arr2[j])
			{
				ecnt++;
				
			}
		}
		if(ecnt==0)
		{
			arr2[index++]=arr[i];
		}
	}
		
    for (int i = 0; i < arr2.length; i++)
    {
	System.out.println(arr2[i]);	
	}
	}
}
