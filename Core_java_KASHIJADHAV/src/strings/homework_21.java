package strings;
//21) Write a program to find Length of the longest substring without repeating characters.
public class homework_21 
{

	public static void main(String[] args) 
	{
		
		String s="jadhav";
		int len=0;
		int si=0;
		int ei=0;
		int fsi=0;
		int fei=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			si=i;
			ei=i;
			
			for (int j = i+1; j < s.length(); j++) 
			{
				char c=s.charAt(j);
				int cnt=0;
				
				for (int k = si; k <= ei; k++)
				{
					if(s.charAt(k)==c)
					{
						cnt++;
						break;
					}
				}
				if(cnt==0)
				{
					ei++;
				}
				else
				{
					break;
				}
			}
			
			int tlen=ei-si+1;
			if(tlen>len)
			{
				len=tlen;
				fsi=si;
				fei=ei;
			}
			
		}
		
		System.out.println(len);
			
		for (int i = fsi; i <=fei; i++)
		{
			
			System.out.println(s.charAt(i));
		}
	

	}

}
