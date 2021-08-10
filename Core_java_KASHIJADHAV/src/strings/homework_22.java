package strings;
//22) Write a program to find the second most frequent character in a given string
public class homework_22 {

	public static void main(String[] args) {
		
		String s="dddkkkkkisjisjisijosllkllllll";
		
		int cnt=0;
		char c='/';
		int max=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j <s.length(); j++) 
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				c=s.charAt(i);
			}
		}
		System.out.println(max+" "+c);
		
		int max2=0;
		char m='/';
		int cnt2=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt2=0;
			for (int j = 0; j <s.length(); j++) 
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					cnt2++;
				}
			}
			if(cnt2>max2 && cnt2<max)
			{
				max2=cnt2;
				m=s.charAt(i);
			}
		}
		
		System.out.println(max2+" "+m);
		
		

	}

}
