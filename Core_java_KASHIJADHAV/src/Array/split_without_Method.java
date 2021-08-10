package Array;

public class split_without_Method {

	public static void main(String[] args)
	{
		String s1="abcdepghijpolmn";
		int cnt=0;
		for (int j = 0; j < s1.length(); j++) 
		{
			if(s1.charAt(j)=='p')
			{
			cnt++;	
			}
		}
		System.out.println(cnt);
		
		String sa[]=new String[cnt+1];
		
		int si=0;
		int ei=0;
		int index=0;
		
		for (int i = 0; i < s1.length(); i++)
		{
		if(s1.charAt(i)=='p' || i==s1.length()-1)	
		{
			ei=i;
			if(i==s1.length()-1)
			{
				ei++;
			}
			
			String p=s1.substring(si, ei);
			sa[index++]=p;
			si=i;
					
		}
		}

		for(String p:sa)
		{
			System.out.println(p);
		}
	}

}
