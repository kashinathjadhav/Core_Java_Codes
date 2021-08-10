
//29) Write a program to sort in ascending and descending order by length of the given array
//of strings.

package strings;
public class homework_29 {

	
	public static void main(String[] args) 
	{
		
		String s="kashi";
		
		char c='/';
	
		for (int i = 0; i <s.length()-1; i++) 
		{
			if(s.charAt(i)>s.charAt(i+1))
			{
				c=s.charAt(i);
			}
		}
System.out.println(c);
	}

}
