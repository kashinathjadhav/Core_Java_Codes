package Array;
//12) Write a program to put even and odd elements of array in two separate arrays.
public class homework_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,10};
		
		int cnt1=0;
		int cnt2=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				cnt1++;
			}
			else
			{
				cnt2++;
			}
			
		}
		
		int even[]=new int[cnt1];
		int odd[]=new int[cnt2];
		
		int index1=0;
		int index2=0;
		
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even[index1++]=arr[i];
			}
			else
			{
				odd[index2++]=arr[i];
			}
			
		}
		
		System.out.println("even array");
		for (int i = 0; i < even.length; i++) 
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("odd array");
		for (int i = 0; i < odd.length; i++)
		{
			System.out.print(odd[i]+" ");
		}
	}

}
