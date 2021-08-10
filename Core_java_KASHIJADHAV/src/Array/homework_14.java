package Array;
//14) Write a program to test the equality of two arrays

public class homework_14 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,10};
		int arr1[]={1,2,3,4,5,6,7,8,9};
		
		int cnt=0;
		
		if(arr.length!=arr1.length)
		{
			System.out.println("not equal");
			System.exit(0);
		}
		else
		{
			for (int i = 0; i < arr1.length; i++) 
			{ if(arr1[i]!=arr[i])
					{
						cnt++;
						break;
					}
			}
		}
		
		if(cnt==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
