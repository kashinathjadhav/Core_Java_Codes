package strings;
//7) Write a program to get the length of a given string.
public class homework_07 {

	public static void main(String[] args) {
		
		String s="kashi";
		//way1:by using length method
		System.out.println(s.length());
		
		//second way by using iterator
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt++;
		}
		System.out.println(cnt);

	}

}
