package strings;
//5) Write a program to get the index of all the characters of the alphabet
public class homework_05 {

	public static void main(String[] args)
	{
		
       String s="kashi007kk";
       
       for (int i = 0; i < s.length(); i++) 
       {
		if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' )
		{
			System.out.println("index of "+s.charAt(i)+" is:"+i);
		}
	   }
	}

}
