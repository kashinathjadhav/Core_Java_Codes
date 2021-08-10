package Array;
//3) Write a program to remove a specific element from an array

public class homework_03 {

	public static void main(String[] args) 
	{
		
        int arr[]= {12,3,4,5,6,77,12,88};
        int no=12;
        int cnt=0;
        
        for (int i = 0; i < arr.length; i++) 
        {
			if(arr[i]==no)
			{
				cnt++;
				
			}
		}
        int arr2[]=new int[arr.length-cnt];
        int index=0;
        
        for (int i = 0; i < arr2.length; i++) 
        {
			if(arr[i]!=no)
			{
				arr2[index]=arr[i];
				index++;
			}
		}
        for (int i = 0; i < arr2.length; i++) 
        {
			System.out.println(arr2[i]);
		}
        
	}

}
