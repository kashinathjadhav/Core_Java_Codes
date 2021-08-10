package strings;

public class prelim_str_rev2 {

	public static void main(String[] args) {
		
		String s="I am in Hefshine";
		//o/p:Hefshine in am I 
		
		int si=0;
		for (int i = 0; i <=s.length()-1; i++)
		{
			if(s.charAt(i)==' ')
			{
				for (int j=i-1; j >=si ; j--)
				{
				System.out.print(s.charAt(j));	
				}
				si=i+1;
				System.out.print(' ');
			}
			else if(i==s.length()-1)
			{
				for (int j =i; j>=si; j--)
				{
				System.out.print(s.charAt(j));	
				}
			}
			
		}


	}

}
