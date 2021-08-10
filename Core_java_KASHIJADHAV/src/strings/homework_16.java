package strings;
//16) Write a program to return the sum of the digits present in the given string. If
//there is no digits the sum return is 0.
public class homework_16 {

	public static void main(String[] args) {
		
		String s="kashi767";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);

	}

}
