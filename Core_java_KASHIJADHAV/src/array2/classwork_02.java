package array2;
//2. Write a program to perform binary search
public class classwork_02 {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,5,7,8,9};
		
		int n=9;
		int cnt=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==n)
			{
				cnt++;
				break;
			}
		}
		
		if(cnt==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(" found");
		}

	}

}
