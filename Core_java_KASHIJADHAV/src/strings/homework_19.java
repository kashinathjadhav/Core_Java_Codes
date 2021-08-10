package strings;
//19) Write a program to find the maximum occurring character in a string.

public class homework_19 {

	public static void main(String[] args) 
	{
		
		String s="qnxklwqdkwqklmklmk";
		int cnt=0;
		
		int acnt=0;
		char w='/';
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					
				}
			}
			if(cnt>acnt)
			{
				acnt=cnt;
				w=s.charAt(i);
			}
		}
		System.out.println(w+"   "+acnt);
	}

}
