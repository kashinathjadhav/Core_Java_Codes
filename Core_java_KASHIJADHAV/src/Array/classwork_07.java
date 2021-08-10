package Array;
//7. Write a program to implement stack methods using array
public class classwork_07 
{
	static int[]arr=new int[5];
	static int index=0;

	public static void main(String[] args) 
	{
		
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
   
    pull();
    pull();
    pull();
    pull();
    pull();
    
  }

	

	private static void push(int n) 
	{
	arr[index++]=n;	
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i]);
		
	}
	System.out.println();
		
	}
	
	private static void pull() {
		index--;
		arr[index]=0;
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
