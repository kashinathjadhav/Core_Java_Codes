package Aarays;
//3) Write a program to remove a specific element from anarray (Variations)
public class Homework_03 {

	public static void main(String[] args)
	{
		int arr[]= {10,11,23,44,55,66,77,88,99};
		
	    int no=23;
	    int cnt=0;
	    for (int i = 0; i < arr.length; i++) 
	    {
			if(arr[i]==no)
			{
				cnt++;
			}
		}
	    
	    System.out.println(cnt);

	}

}
