package strings;
//1) Write a program to create a new String object with the contents of a character array
public class homework_01 {

	public static void main(String[] args)
	{
		
     char arr[]= {'k','a','s','h','i'};
     String s="";
     
     for (int i = 0; i < arr.length; i++)
     {
		s+=arr[i];
	 }
     
     System.out.println(s);
	}

}
