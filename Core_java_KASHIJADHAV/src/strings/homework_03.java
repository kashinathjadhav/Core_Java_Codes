package strings;
//3) Write a program to check whether two String objects contain the samedata
public class homework_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="piyush";
		String s2="piyushkk";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not equal");
			
		}
		else
		{
			int cnt1=0;
			for (int i = 0; i < s1.length(); i++) 
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					cnt1++;
					break;
				}
			}
			if(cnt1==0)
			{
				System.out.println("same data");
			}
			else
			{
				System.out.println("not same data");
			}
		}

	}

}
