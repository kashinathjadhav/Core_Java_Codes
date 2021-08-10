package strings;
//3) Write a program to compare two strings lexicographically.
public class classwork_03 {

	public static void main(String[] args) 
	{
		
       String s="kashi";
       String s2="kashiikkkk";
       
       boolean flag=true;
       
       for (int i = 0; i < s.length()&& i<s2.length(); i++) 
       {
		if(s.charAt(i)!=s2.charAt(i))
		{
			System.out.println(s.charAt(i)-s2.charAt(i));
			flag=false;
			break;
		}
	   }
       if(flag)
       {
          if(s.length()!=s2.length())
          {
        	  System.out.println(s.length()-s2.length());
          }
          else
          {
        	  System.out.println(0);
          }
       }
       
	}

}
