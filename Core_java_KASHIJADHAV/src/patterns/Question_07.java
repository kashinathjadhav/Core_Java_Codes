package patterns;


class Reverse
{
	void specialReverse(char arr[],int size)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length/2;i++)
		{
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
			{
			char a=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=a;
			}
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
public class Question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[]= {'A','&','C','*','S','$','$'};
		 
		Reverse rr=new Reverse();
		rr.specialReverse(arr,6);
		
		
			}

}