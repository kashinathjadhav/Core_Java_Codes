package Array;
//32) Write a program of how to pass array as a parameter to method in java?
class my
{
	void display(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
		System.out.print(a[i]+" ");	

		}
	}
}
public class homework_32
{

	public static void main(String[] args) 
	{
	int p[]= {12,33,44,55,66};
	my mm=new my();
	mm.display(p);

	}

}
