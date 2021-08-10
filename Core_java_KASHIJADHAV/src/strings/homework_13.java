package strings;
//13) Write a program to remove a specified character from a given string.
public class homework_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char p='a';
		String s="bewafa tera masum chehra bhul jane ke kabool nhin hain";
		
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)!=p)
			{
				s2+=s.charAt(i);
				
			}
		}
		System.out.println(s2);
	}

}
