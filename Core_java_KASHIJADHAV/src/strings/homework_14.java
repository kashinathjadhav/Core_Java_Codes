package strings;
//14) Write a program to test if a given string contains only digits.
public class homework_14 {

	public static void main(String[] args) {
		
		String s="828k920kmkk";
		int cnt=0;
		for (int i = 0; i <s.length(); i++)
		{
		if(!(s.charAt(i)>=48 && s.charAt(i)<=57))
		{
			cnt++;
			break;
		}
		}
		
		if(cnt==0)
		{
			System.out.println("all numbers");
		}
		else
		{
			System.out.println("not number");
		}
		
	}

}
