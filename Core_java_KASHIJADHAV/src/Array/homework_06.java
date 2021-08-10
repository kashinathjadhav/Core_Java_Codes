package Array;
//6) Write a program to find and display reverse of an array without using thirdvariable
public class homework_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[]= {12,22,33,44,55,66,77,88,99};
		
		for (int i = 0; i < arr.length/2; i++) 
		{
			arr[i]=arr[i]+arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
			arr[i]=arr[i]-arr[arr.length-1-i];
			
		}

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
