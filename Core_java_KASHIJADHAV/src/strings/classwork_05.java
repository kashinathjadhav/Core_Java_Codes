package strings;
//5) Write a program to concatenate a given string to the end of another string
public class classwork_05 {

	public static void main(String[] args) 
	{
	
		String s1="vijay";
		String s2="jadhav";
		String s3="";
		
		
		//System.out.println(s1.length());
		//System.out.println(s2.length());
		int k=0;
		
		for (int i = 0; i <= s1.length()+s2.length(); i++) 
		{
			
			if(i<s1.length())
			{
				s3+=s1.charAt(i);
			}
			if(i>s1.length())
			{
				
				s3+=s2.charAt(k++);
				
			}
		}
		
		System.out.println(s3);
		
		

	}

}
