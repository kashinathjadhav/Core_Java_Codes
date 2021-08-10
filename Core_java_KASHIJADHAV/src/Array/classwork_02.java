package Array;
//2. Write a program to perform binary search.
public class classwork_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,4,5,7,20};
		
		int n=21;
		int max=arr.length-1;
		int min=arr[0];
		int cnt=0;
		for (int i = 0; i < arr.length; i++) 
		{
			int mid=(min+max)/2;
			
			if(arr[mid]==n)
			{
				cnt++;
				break;
			}
			else if(n<mid)
			{
				max=mid-1;
				
			}
			else
			{
				min=mid+1;
			}
		}
		if(cnt!=0)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
