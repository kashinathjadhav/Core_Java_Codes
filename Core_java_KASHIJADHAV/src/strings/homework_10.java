package strings;
//10) Write a program to create a character array containing the contents of a string.
public class homework_10 {

	public static void main(String[] args)
	{
		
		String s1="kashinath";
		
		char arr[]=new char[s1.length()];
		
		for (int i = 0; i < s1.length(); i++) 
		{
			arr[i]=s1.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) 
		{
		System.out.print(arr[i]+" ");
		}
	}

}
