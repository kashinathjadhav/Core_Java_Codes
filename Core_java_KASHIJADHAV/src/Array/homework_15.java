package Array;
//15) Write a program to print all the LEADERS in the array.
//Note: An element is leader if it is greater than all the elements to its right side
public class homework_15 {

	public static void main(String[] args) 
	{
		int arr[]= {89,54,56,76,89,65,98,87};
		
		

		for(int i=0;i<arr.length;i++)
		{
			int leader=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					leader++;
					break;
				}
				
			}
			if(leader==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
